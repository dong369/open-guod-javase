package ch11_reflection.method;

import ch11_reflection.entity.PeopleMan;
import ch11_reflection.entity.User;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * project - 给定一个对象，打印出这个对象身上所有的成员变量名称和类类型
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:8:26
 * @since 1.8
 */
public class MethodTest {
    // 调用对象方法
    @Test
    public void invokeMethod() throws Exception {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        PeopleMan peopleMan = peopleManClass.newInstance();
        Method showNative = peopleManClass.getDeclaredMethod("showNative", String.class);
        showNative.setAccessible(true);
        showNative.invoke(peopleMan,"中国");
    }

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
}
