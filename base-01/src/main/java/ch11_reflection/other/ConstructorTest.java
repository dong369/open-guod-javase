package ch11_reflection.other;

import ch11_reflection.entity.MyAnnotation;
import ch11_reflection.entity.PeopleMan;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Project -
 *
 * @author by guodd
 * @version 1.0
 * @date 2020/2/17
 * @since 1.8
 */
public class ConstructorTest {
    // 获取运行时类的父类

    // 获取运行时类带泛型的父类

    // 获取运行时类带泛型的父类的泛型

    // 获取实现的接口

    // 获取运行时类所在的包

    // 获取类上的注解
    @Test
    public void getAnnotation() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        for (Field field : peopleManClass.getFields()) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
            }
        }
        Annotation[] annotations = peopleManClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getEnclosingMethod());
        }
    }
}