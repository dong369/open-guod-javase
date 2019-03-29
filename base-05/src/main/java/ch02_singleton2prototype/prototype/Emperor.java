package ch02_singleton2prototype.prototype;

import java.util.ArrayList;
import java.util.Random;

/**
 * project -
 *
 * @author yanfa07
 * @version 1.0
 * @date 日期:2019/3/29 时间:15:59
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Emperor {
    //定义最多能产生的实例数量
    private static int maxCountEmperor = 2;
    //每个皇帝都有名字,使用一个ArrayList来容纳,每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<>();
    //定义一个列表,容纳所有的皇帝实例
    private static ArrayList<Emperor> emperorList = new ArrayList<>();
    //当前皇帝序列号
    private static int countEmperor = 0;

    private Emperor() {
    }

    static {
        for (int i = 0; i < maxCountEmperor; i++) {
            emperorList.add(new Emperor("皇帝" + (i + 1)));
        }
    }

    public Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random readable = new Random();
        countEmperor = readable.nextInt(maxCountEmperor);
        return emperorList.get(countEmperor);
    }

    public static String say() {
        return nameList.get(countEmperor);
    }
}
