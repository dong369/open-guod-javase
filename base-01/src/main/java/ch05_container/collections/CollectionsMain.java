package ch05_container.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class CollectionsMain {
    public static void main(String[] args) {
        Set<Object> objects = Collections.newSetFromMap(new HashMap<>());
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
