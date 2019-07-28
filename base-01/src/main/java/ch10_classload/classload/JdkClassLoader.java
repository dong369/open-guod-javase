package ch10_classload.classload;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/16 时间:18:57
 * @JDK 1.8
 * @Description 功能模块：ClassLoader类加载（-verbose:class配置后可以查看对应的类加载过程）
 */
public class JdkClassLoader {
    public static void main(String[] args) {
        // 01Bootstrap
        System.out.println(String.class.getClassLoader() + "Bootstrap");
        // 02ExtClassLoader
        System.out.println(com.sun.crypto.provider.AESKeyGenerator.class.getClassLoader().getClass().getName());
        // 03AppClassLoader
        System.out.println(JdkClassLoader.class.getClassLoader().getClass().getName());

        System.out.println("===================================");

        // 对象的关系（不是类继承关系）
        ClassLoader c = JdkClassLoader.class.getClassLoader();
        while (c != null) {
            System.out.println(c.getClass().getName());
            c = c.getParent();
        }
    }
}
