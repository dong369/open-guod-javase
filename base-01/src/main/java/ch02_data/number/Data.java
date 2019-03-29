package ch02_data.number;

import java.util.HashMap;
import java.util.Map;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:02
 * @JDK 1.8
 * @Description 功能模块：四类八种（整型、浮点型、字符型、布尔型）
 */
public class Data {

    public static void main(String[] args) {
        byte a = 1;
        Byte aa = 1;

        short b = 2;
        Short bb = 2;

        int c = 3;
        Integer cc = 3;

        long d = 4;
        Long dd = 4L;

        float e = 5;
        Float ee = 5F;

        double f = 6;
        Double ff = 6D;

        char g = 7;
        Character gg = 7;

        boolean h = true;
        Boolean hh = false;

        // 01 自动类型转换/强制类型转换/类型提升，自动转换也要小心数据溢出问题
        System.out.println((long) (Double.valueOf("0.02") * 100));
        System.out.println(0.05 + 0.01);
        int aaa = a + a;
        int ccc = +c;
        System.out.println(aaa);

        // 02 Java中的自动装箱和拆箱
        Integer valueOf = Integer.valueOf("3");
        int intValue = valueOf.intValue();
        int parseInt = Integer.parseInt("3");
        double java = 1L / 1.00;
        System.out.println(java);

        // 03精度丢失
        System.out.println(1.0 - 0.9);
        System.out.println(0.05 + 0.01);
        System.out.println(.12);
        System.out.println(e - 4.1);
        if (e - 4.1 > 0.9) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(0.2 + 400.03);

        // map中的字符串不能直接强制转成Integer类型，需要借助静态方法处理
        Map<String, Object> map = new HashMap<>();
        map.put("a", "2");
        map.put("b", 2);
        Integer a1 = Integer.valueOf((String) map.get("a"));
        Integer a2 = Integer.parseInt((String) map.get("a"));
        System.out.println(a1);
        Integer b1 = (Integer) map.get("b");
        System.out.println(b1);
    }
}
