package ch10_classload.classload;

/**
 * ClassLoader类加载（-verbose:class配置后可以查看对应的类加载过程）
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/16 时间:18:57
 * @since 1.8
 */
public class JdkClassLoader {
    public static void main(String[] args) {
        // 01、Bootstrap
        System.out.println(String.class.getClassLoader() + "Bootstrap");
        // 02、ExtClassLoader
        System.out.println(com.sun.crypto.provider.AESKeyGenerator.class.getClassLoader().getClass().getName());
        // 03、AppClassLoader
        System.out.println(JdkClassLoader.class.getClassLoader().getClass().getName());

        System.out.println("===================================");

        // 对象的关系（不是类继承关系）
        // 自定义类是通过系统加载器进行加载，系统加载器通过扩展加载器获取，无法获取引导加载器
        ClassLoader c = JdkClassLoader.class.getClassLoader();
        while (c != null) {
            System.out.println(c.getClass().getName());
            c = c.getParent();
        }
    }
}
