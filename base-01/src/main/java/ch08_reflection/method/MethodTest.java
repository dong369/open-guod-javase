package ch08_reflection.method;

import ch08_reflection.entity.PeopleMan;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * project - 给定一个对象，打印出这个对象身上所有的成员变量名称和类类型
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class MethodTest {
    // 获取对象的方法
    @Test
    public void getClassMethod() {
        Class<?> aClass = PeopleMan.class;
        // 返回某个类的所有公用（public）方法包括其继承类的公用方法，当然也包括它所实现接口的方法。
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println();
        // 返回类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        System.out.println();

        // 父类仅包含公共的方法
        Method[] superMethod = aClass.getSuperclass().getMethods();
        for (Method method : superMethod) {
            System.out.println(method);
        }
        System.out.println();
        // 全部的方法（包含父类的）
        Method[] superDeclareMethod = aClass.getSuperclass().getDeclaredMethods();
        for (Method declaredMethod : superDeclareMethod) {
            System.out.println(declaredMethod);
        }
    }

    // 获取方法的注解、权限修饰符、返回值类型、方法名称、参数列表、异常
    @Test
    public void test() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        Method[] methods = peopleManClass.getMethods();
        for (Method method : methods) {
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println(annotation);
            }
            System.out.println(Modifier.toString(method.getModifiers())
                               + " " + method.getName()
                               + " " + method.getReturnType());

        }
    }

    // 调用对象的非静态方法
    @Test
    public void invokeMethod() throws Exception {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        PeopleMan peopleMan = peopleManClass.newInstance();
        // 获取指定的某个方法
        Method showNative = peopleManClass.getDeclaredMethod("showNative", String.class);
        // 保证当前方法是可操作的
        showNative.setAccessible(true);
        // 方法调用
        String invoke = (String) showNative.invoke(peopleMan, "中国");
        System.out.println(invoke);
    }

    // 调用对象的静态方法
    @Test
    public void invokeMethodStatic() throws Exception {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        Method showStatic = peopleManClass.getDeclaredMethod("showStatic");
        showStatic.setAccessible(true);
        // 两种方式都可以
        PeopleMan invoke1 = (PeopleMan) showStatic.invoke(null);
        PeopleMan invoke2 = (PeopleMan) showStatic.invoke(PeopleMan.class);
    }
}