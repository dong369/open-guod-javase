package ch08_reflection.createobject;

import ch08_reflection.entity.User;
import org.junit.Test;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @since JDK1.8
 */
public class NewInstance {
    // 创建对象
    @Test
    public void createObj() throws Exception {
        Class<?> aClass = Class.forName("ch08_reflection.entity.User");
        // 条件：无参构造器；权限要够
        // User user = (User) aClass.newInstance();
        Object o1 = aClass.newInstance();
        Object o = aClass.getConstructor().newInstance();
        User user = (User) aClass.getDeclaredConstructor().newInstance();
        boolean annotation = aClass.isAnnotation();
        System.out.println(annotation);
        user.setAge(20);
        System.out.println(user.getAge());
    }
}
