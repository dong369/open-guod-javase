package ch12_annotations.extract;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/12 时间:18:08
 * @JDK 1.8
 * @Description 功能模块：注解的提取
 */
public class MainAnnotation {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("ch12_annotations.extract.UseAnnotation");
        // 注解的提取
        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("tet");
            MainAnnotation.class.getAnnotations();
        }
    }
}
