package packageall.util.random;

import java.util.Random;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:11:09
 * @JDK 1.8
 * @Description 功能模块：随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        int i = new Random().nextInt(90);
        System.out.println(i);
    }
}
