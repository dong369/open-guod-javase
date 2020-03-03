package ch12_annotation.base;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/7/4 时间:8:08
 * @since 1.8
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("ch12_annotation.hibernate.UserEntity");
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(annotations.length);
        Field[] declaredFields = aClass.getDeclaredFields();
    }
}
