package ch02_data.string;

import org.junit.Test;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class StringObject {
    @Test
    public void string() {
        // JVM 1.6之前可以看成是4个对象：str+ab+cd+abcd
        // JVM 1.6之后可以看成是2个对象：str（引用对象）+abcd（字符串常量对象）
        String str = "ab" + "cd";
        System.out.println(str);
    }

    @Test
    public void str() {
        String a = "a";
        String b = "b";
        String str = a + b;
        System.out.println(str);
    }

    @Test
    public void te() {
        float a = 6f;
        String str = String.valueOf(a);
        System.out.println("");
        System.out.println(str);
        int idx = str.lastIndexOf(".");
        System.out.println(idx);
        String strNum = str.substring(0, idx);
        System.out.println(strNum);
        int num = Integer.parseInt(strNum);
        System.out.println(num);
    }
}