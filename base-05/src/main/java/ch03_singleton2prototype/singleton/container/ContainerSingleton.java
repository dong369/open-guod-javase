package ch03_singleton2prototype.singleton.container;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 * @see java.awt.Desktop（getDesktop方法）
 */
public class ContainerSingleton {
    static Map<String, Object> singletonMap = new HashMap<>();

    private ContainerSingleton() {
    }

    public static void putInstance(String key, Object value) {
        if (StringUtils.isNotBlank(key) && value != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, value);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
