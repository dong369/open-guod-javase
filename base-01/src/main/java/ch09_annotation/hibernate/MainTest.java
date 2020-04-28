package ch09_annotation.hibernate;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("ch09_annotation.hibernate.UserEntity");
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(annotations.length);
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(SetProperty.class)) {
                SetProperty annotation = declaredField.getAnnotation(SetProperty.class);
                System.out.println(annotation.name());
            }
        }
    }
}
