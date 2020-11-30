package ch02_data.generics.old;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author by guodd
 * @version 1.0
 */
public class BaseNoGeneric {
    // 原始方式？考虑下优缺点
    @Test
    public void createObject() {
        BaseObject baseObject = new BaseObject();
        // 泛型可以理解是一个守门员，不加泛型就没有守门员可以随便放
        baseObject.setO(1);
        baseObject.setO("java");
        String t = (String) baseObject.getO();
        System.out.println(t);
    }

    @Test
    public void listInfo(){
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        // objects.add("");
        System.out.println(objects);
    }
}
