package ch12_annotations.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/12 时间:11:56
 * @JDK 1.8
 * @Description 功能模块：
 */
public class AnnotationParser {
    public static void main(String[] args) throws Exception {
        Method[] methods = AnnotationParser.class.getClassLoader().loadClass("ch12_annotations.base.AnnotationDemo").getMethods();
        Field[] fields = AnnotationParser.class.getClassLoader().loadClass("ch12_annotations.base.AnnotationDemo").getDeclaredFields();
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