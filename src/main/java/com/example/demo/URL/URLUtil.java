package com.example.demo.URL;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

public class URLUtil {

    public static void judgeContent() throws IOException {
        URL u = new URL("http://www.baidu.com");
        Class<?>[] types = new Class[3];
        types[0] = String.class;
        types[1] = Reader.class;
        types[2] = InputStream.class;
        Object o = u.getContent(types);
        if (o instanceof String) {
            System.out.println(o);
        } else if (o instanceof Reader r) {
            int c;
            while ((c = r.read()) != -1) {
                System.out.println((char) c);
            }
            r.close();
        } else if (o instanceof InputStream in) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.write(c);
            }
            in.close();
        } else {
            System.out.println("Error: unexpected type " + o.getClass());
        }

    }
}
