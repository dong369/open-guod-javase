package ch11_reflection.createobject;

import ch11_reflection.entity.User;
import org.junit.Test;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
public class NewInstance {
    // 创建对象
    @Test
    public void createObj() throws Exception {
        Class<?> aClass = Class.forName("ch11_reflection.entity.User");
        // 条件：无参构造器；权限要够
        User user = (User) aClass.newInstance();
        boolean annotation = aClass.isAnnotation();
        System.out.println(annotation);
        user.setAge(20);
        System.out.println(user.getAge());
    }
}
