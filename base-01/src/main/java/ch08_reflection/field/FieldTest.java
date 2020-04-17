package ch08_reflection.field;

import ch08_reflection.entity.PeopleMan;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class FieldTest {
    // 获取对象的属性
    @Test
    public void field() {
        // getFields()，获取当前运行实例以及父类中声明为public的属性，考虑权限修饰符
        Class<?> aClass = PeopleMan.class;
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();
        // getDeclaredFields()，获取当前运行实例的所有属性，不考虑权限修饰符，不包含父类
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

    // 获取对象的属性的具体内容
    @Test
    public void fieldsDetail() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        for (Field field : peopleManClass.getDeclaredFields()) {
            System.out.println(
                    field.getName() + ","
                    + field.getModifiers() + ","
                    + Modifier.toString(field.getModifiers()) + ","
                    + field.getType()
            );
        }
    }

    // 赋值属性
    @Test
    public void fieldValue() throws Exception {
        // 获取[类对象]
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        // 创建运行时对象
        PeopleMan peopleMan = peopleManClass.newInstance();
        // 获取指定的属性，非静态属性依托于对象
        Field manId = peopleManClass.getDeclaredField("ManId");
        // 保证当前属性是可操作的
        manId.setAccessible(true);
        // 赋值
        manId.set(peopleMan, 1);
        // 获取值
        Integer o = (Integer) manId.get(peopleMan);
        System.out.println(o);
        System.out.println(ToStringBuilder.reflectionToString(peopleMan));
    }

    // 赋值静态属性

}