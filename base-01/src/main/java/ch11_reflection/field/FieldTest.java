package ch11_reflection.field;

import ch11_reflection.entity.PeopleMan;
import ch11_reflection.entity.User;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:10:44
 * @since 1.8
 */
public class FieldTest {
    // 获取对象的属性
    @Test
    public void field() {
        Class<?> aClass = PeopleMan.class;
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println();
        Field[] superField = aClass.getSuperclass().getFields();
        for (Field field : superField) {
            System.out.println(field);
        }
        System.out.println();
        Field[] superDeclaredFields = aClass.getSuperclass().getDeclaredFields();
        for (Field superDeclaredField : superDeclaredFields) {
            System.out.println(superDeclaredField);
        }
    }
}
