package ch03_singleton2prototype.singleton.lazy;

import org.junit.Test;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Main {
    @Test
    public void test() {
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
    }
}
