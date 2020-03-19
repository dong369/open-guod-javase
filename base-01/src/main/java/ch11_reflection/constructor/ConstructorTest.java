package ch11_reflection.constructor;

import ch11_reflection.entity.PeopleMan;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Project -
 *
 * @author by guodd
 * @version 1.0
 * @date 2020/2/17
 * @since 1.8
 */
public class ConstructorTest {
    // 获取构造器
    @Test
    public void constructorAll() {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        Constructor<?>[] constructors1 = peopleManClass.getConstructors();
        for (Constructor<?> constructor : constructors1) {
            System.out.println(constructor);
        }
        System.out.println();
        Constructor<?>[] constructors2 = peopleManClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors2) {
            System.out.println(constructor);
        }
    }

    // 调用运行时类中的构造器
    @Test
    public void constructorMethod() throws Exception {
        Class<PeopleMan> peopleManClass = PeopleMan.class;
        Constructor<PeopleMan> constructor = peopleManClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        PeopleMan aa = constructor.newInstance("aa");
        System.out.println(ToStringBuilder.reflectionToString(aa));
    }
}
