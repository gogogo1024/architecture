package com.example.demo;

import com.example.demo.pattern.singleton.Singleton;
import lombok.Cleanup;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootTest
public class SingletonTests {
    @Test
    /**
     * 序列化单例测试
     */
    void seriliableTest() throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        // 将s1序列化到磁盘
        FileOutputStream fos = new FileOutputStream("a.obj");
        @Cleanup ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);

        oos.flush();

        @Cleanup FileInputStream fis = new FileInputStream("a.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // 从磁盘反序列化
        instance2 = (Singleton) ois.readObject();
        System.out.println("instance1 == instance2");
        System.out.println(instance1 == instance2);
    }

    @Test
    void reflectionTest() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        // 下面利用反射构造出新实例会提示报错
        try {
            Constructor<? extends Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true); // 暴力反射
            instance2 = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("instance1.hashCode():- "
                + instance1.hashCode());
        System.out.println("instance2.hashCode():- "
                + instance2.hashCode());
        System.out.println("instance1 == instance2");
        System.out.println(instance1 == instance2);
    }


    @Test
    void classLoadTest() throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 自定义加载类
        // TODO 文件路径优化
        Path path = Paths.get("src/main/java/");
        String absPath = path.toUri().toString();

        URLClassLoader cl1 = new URLClassLoader(new URL[]{
                new URL(absPath)}, null);
        URLClassLoader cl2 = new URLClassLoader(new URL[]{
                new URL(absPath)}, null);
        Class singletonClass1 = cl1.loadClass("com.example.demo.HelloWorld");
        Class singletonClass2 = cl2.loadClass("com.example.demo.HelloWorld");

        // 实例化类
        Object instance1 = singletonClass1.getConstructor().newInstance();
        Object instance2 = singletonClass2.getConstructor().newInstance();

        // 获取类的方法
        Method method1 = singletonClass1.getDeclaredMethod("print");
        Method method2 = singletonClass2.getDeclaredMethod("print");

        // 调用实例化类的方法
        method1.invoke(instance1);
        method2.invoke(instance2);

        System.out.println("instance1 != instance2");
        System.out.println(instance1 == instance2);
    }
}
