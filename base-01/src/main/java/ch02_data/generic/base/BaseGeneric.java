package ch02_data.generic.base;

import ch02_data.generic.useclass.GenericClass;
import org.junit.Test;

/**
 * Project -
 *
 * @author by guodd
 * @version 1.0
 * @date 2020/2/17
 * @since 1.8
 */
public class BaseGeneric {
    // 原始方式？考虑下优缺点
    @Test
    public void createObject() {
        GenericClass genericClass = new GenericClass();
        genericClass.setT(1);
        genericClass.setT("java");

        Object t = genericClass.getT();
    }
}
