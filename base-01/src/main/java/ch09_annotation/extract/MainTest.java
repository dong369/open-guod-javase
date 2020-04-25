package ch09_annotation.extract;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * 注解的提取
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class MainTest {
    @Test
    public void main() throws Exception {
        Class<?> aClass = Class.forName("ch09_annotation.extract.UseAnnotation");
        // 如果指定类型的注解存在于此元素上，则返回 true，否则返回 false。
        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            // 该元素如果存在指定类型的注解，则返回这些注解，否则返回 null。
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.value());

            // 返回此元素上存在的所有注解，包括从父类继承的
            for (Annotation annotation1 : aClass.getAnnotations()) {
                Class<? extends Annotation> aClass1 = annotation1.annotationType();
                System.out.println(aClass1);
                MyAnnotation annotation2 = aClass1.getAnnotation(MyAnnotation.class);
                System.out.println(annotation2);
                // System.out.println(annotation2.value());
            }
        }
    }
}
