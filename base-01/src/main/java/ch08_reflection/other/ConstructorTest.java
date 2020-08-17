package ch08_reflection.other;

import ch08_reflection.entity.MyAnnotation;
import ch08_reflection.entity.PeopleMan;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Project -
 *
 * @author by guodd
 * @version 1.0
 * @since 1.8
 */
public class ConstructorTest {
    // 获取运行时类的父类
    @Test
    public void getParent() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        System.out.println(peopleManClass.getSuperclass());
    }

    // 获取运行时类带泛型的父类
    @Test
    public void getGenericParent() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        System.out.println(peopleManClass.getGenericSuperclass());
    }

    // 获取运行时类带泛型的父类的泛型
    @Test
    public void getGenericParentType() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        ParameterizedType type = (ParameterizedType) peopleManClass.getGenericSuperclass();
        Type[] actualTypeArguments = type.getActualTypeArguments();
        for (Type actualTypeArgument : actualTypeArguments) {
            System.out.println(actualTypeArgument.getTypeName());
        }
    }

    // 获取实现的接口
    @Test
    public void getInterface() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        Class<?>[] interfaces = peopleManClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }

    // 获取运行时类所在的包
    @Test
    public void getPackage(){
        Class<PeopleMan> clazz = PeopleMan.class;
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage.getName());
    }

    // 获取类上的注解
    @Test
    public void getAnnotation() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        Annotation[] annotations1 = peopleManClass.getAnnotations();
        for (Annotation annotation : annotations1) {
            Class<? extends Annotation> aClass = annotation.annotationType();
            System.out.println(aClass.getName());
            MyAnnotation annotation1 = aClass.getAnnotation(MyAnnotation.class);
            String value = annotation1.value();
            System.out.println(annotation1.value());
        }
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