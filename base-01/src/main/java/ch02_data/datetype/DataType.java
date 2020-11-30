package ch02_data.datetype;

import cn.hutool.core.convert.Convert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 四类八种（整型、浮点型、字符型、布尔型）
 * 原始类型: boolean，char，byte，short，int，long，float，double
 * 包装类型：Boolean，Character，Byte，Short，Integer，Long，Float，Double
 * 引用类型：枚举、类、接口
 *
 * @author guod
 * @version 1.0
 */
public class DataType {

    @Test
    public void baseInfo(){
        // 1byte=8bits
        byte a = 1;
        Byte aa = 1;

        // 2byte=16bits
        short b = 2;
        Short bb = 2;

        // 4byte=32bits
        int c = 3;
        Integer cc = 3;

        // 8byte=64bits
        long d = 4;
        Long dd = 4L;

        // 4byte=32bits
        float e = 5;
        Float ee = 5F;

        // 8byte=64bits
        double f = 6;
        Double ff = 6D;

        // 1byte=16bits
        char g = 7;
        Character gg = 7;

        // 1bit
        boolean h = true;
        Boolean hh = false;

        // 01自动类型转换是指：数字表示范围小的数据类型可以自动转换成范围大的数据类型；自动转换也要小心数据溢出问题。
        // 02强制类型转换是指：强制显示的把一个数据类型转换为另外一种数据类型。
        // 03所谓类型提升是指：就是指在多种不同数据类型的表达式中，类型会自动向范围表示大的值的数据类型提升。
        System.out.println((long) (Double.valueOf("0.02") * 100));
        System.out.println(0.05 + 0.01);
        int aaa = a + a;
        int ccc = +c;
        System.out.println(aaa);

        // 02 Java中的自动装箱和拆箱
        Integer valueOf = Integer.valueOf("3");
        int intValue = valueOf.intValue();
        int parseInt = Integer.parseInt("1");
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
    }

    // 取值范围
    @Test
    public void intData() {
        System.out.println(Integer.MIN_VALUE + "，" + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "，" + Long.MAX_VALUE);
        String str = "1.0";
        System.out.println(str.substring(0, str.length() - 2));
    }

    @Test
    public void getValue() {
        // map中的字符串不能直接强制转成Integer类型，需要借助静态方法处理
        Map<String, Object> map = new HashMap<>();
        map.put("a", "2");
        map.put("b", 2);

        // Integer a3 = (Integer) map.get("a");
        // String b2 = (String) map.get("b"); 错误写法
        Integer a1 = Integer.valueOf((String) map.get("a"));
        int a2 = Integer.parseInt((String) map.get("a"));
        System.out.println(a1 + "," + a2);
        Integer b1 = (Integer) map.get("b");
        System.out.println(b1);
        // hutool工具类
        System.out.println(Convert.toInt(map.get("a")));
    }
}
