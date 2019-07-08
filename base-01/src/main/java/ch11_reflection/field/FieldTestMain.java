package ch11_reflection.field;

import java.lang.reflect.Field;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:10:44
 * @JDK 1.8
 * @Description 功能模块：
 */
public class FieldTestMain {
    public static void main(String[] args) {
        Class<? extends ClassLoader> aClass = FieldTestMain.class.getClassLoader().getClass();
        // getDeclaredFields和getFields
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }
}
