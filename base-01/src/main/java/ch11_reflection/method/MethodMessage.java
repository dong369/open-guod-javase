package ch11_reflection.method;

import java.lang.reflect.Method;

/**
 * project - 反射
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:8:26
 * @JDK 1.8
 * @Description 功能模块：给定一个对象，打印出这个对象身上所有的成员变量名称和类类型
 */
public class MethodMessage {
    public static void main(String[] args) {
        printMethodMessage("java");
    }

    public static void printMethodMessage(Object object) {
        StringBuilder temp = new StringBuilder();
        // 01获取字节码文件
        Class<?> aClass = object.getClass();
        // 02获取所有方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            // 返回值的类类型
            Class<?> returnType = method.getReturnType();
            // 返回类型名称
            temp.append(returnType.getName()).append(" ");
            // 获取方法的名字
            String name = method.getName();
            temp.append(name).append("(");
            // 参数列表
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> class1 : parameterTypes) {
                String parameterName = class1.getName();
                temp.append(parameterName).append(",");
            }
            temp.append(")");
            System.out.println(temp);
            temp = new StringBuilder();
        }
    }
}
