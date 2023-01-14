package com.example.demo.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public final class PlatformFactory {
    private static Map<String, Platform> map = new HashMap<>();

    private PlatformFactory() {
        throw new AssertionError("Cannot instantiate the FlyweightFactory class");
    }

    /**
     * 获取平台实例（就是根据platformType分组保存不同平台实例）
     *
     * @param platformType 平台类型
     * @return
     */
    public static synchronized Platform getPlatformInstance(String platformType) {
        Platform platform = map.get(platformType);
        if (platform == null) {
            switch (platformType) {
                case "C":
                    platform = new CPlatform();
                    break;
                case "Java":
                    platform = new JavaPlatform();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }
}

