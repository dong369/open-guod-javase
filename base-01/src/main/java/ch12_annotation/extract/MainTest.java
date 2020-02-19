package ch12_annotation.extract;

/**
 * 注解的提取
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/12 时间:18:08
 * @since 1.8
 */
public class MainTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("ch12_annotation.extract.UseAnnotation");
        // 注解的提取
        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("tet");
            MainTest.class.getAnnotations();
        }
    }
}
