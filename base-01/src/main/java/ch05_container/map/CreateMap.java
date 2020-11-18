package ch05_container.map;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * The class/interface
 *
 * @author guod
 * @version 1.0 use jdk 1.8
 */
public class CreateMap {
    @Test
    public void create() {
        HashMap<Object, Object> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>() {{
            put("a", "b");
            put("b", "b");
        }};
        Map<String, Integer> map3 = Map.of("Hello", 1, "World", 2);
        Map<String, Integer> map4 = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        System.out.println(map2);
    }
}
