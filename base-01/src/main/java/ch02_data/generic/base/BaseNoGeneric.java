package ch02_data.generic.base;

import org.junit.Test;

/**
 * @author by guodd
 * @version 1.0
 */
public class BaseNoGeneric {
    // 原始方式？考虑下优缺点
    @Test
    public void createObject() {
        BaseObject baseObject = new BaseObject();
        baseObject.setO(1);
        baseObject.setO("java");
        String t = (String) baseObject.getO();
        System.out.println(t);
    }
}