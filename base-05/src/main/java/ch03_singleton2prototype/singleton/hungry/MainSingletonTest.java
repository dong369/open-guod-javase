package ch03_singleton2prototype.singleton.hungry;


/**
 * 老张只拥有一辆车
 *
 * @author guod
 * @version 1.0
 */
public class MainSingletonTest {
    public static void main(String[] args) {
        HungrySingleton car = HungrySingleton.getInstance();
        System.out.println(car.getClass());
        System.out.println(HungrySingleton.getInstance());
    }
}
