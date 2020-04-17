package ch09_annotation.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class AnnotationParser {
    public static void main(String[] args) throws Exception {
        Method[] methods = AnnotationParser.class.getClassLoader().loadClass("ch09_annotation.base.AnnotationDemo").getMethods();
        Field[] fields = AnnotationParser.class.getClassLoader().loadClass("ch09_annotation.base.AnnotationDemo").getDeclaredFields();
        for (Method method : methods) {
            // 判断它是否应用了某个注解
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                // 获取 Annotation 对象
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("method: " + method);
                System.out.println("name= " + annotation.name() +
                                   " , website= " + annotation.website()
                                   + " , revision= " + annotation.revision());
            }
        }

        for (Field field : fields) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
                System.out.println(field);
                System.out.println("name= " + annotation.name() +
                                   " , website= " + annotation.website()
                                   + " , revision= " + annotation.revision());
            }
        }
    }
}