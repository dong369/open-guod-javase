package ch03_oothinking.hashcode;

import org.junit.Test;

import java.util.ArrayList;

/**
 * The class/interface hashcode不是地址值
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class HashCodeUse {
    @Test
    public void exitHashCode() {
        ArrayList<Object> objects = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < 200000; i++) {
            Object o = new Object();
            if (objects.contains(o.hashCode())) {
                System.out.println("exit a hashcode..");
                num++;
            } else {
                objects.add(o.hashCode());
            }
        }
        System.out.println("相同的hashCode个数：" + num);
        System.out.println("不同的hashCode个数：" + objects.size());
    }
}
