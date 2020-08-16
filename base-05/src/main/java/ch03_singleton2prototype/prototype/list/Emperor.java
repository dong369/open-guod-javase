package ch03_singleton2prototype.prototype.list;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author guodd
 * @version 1.0
 */
public class Emperor {
    // 定义最多能产生的实例数量
    static int maxCountEmperor = 2;
    // 每个皇帝都有名字,使用一个ArrayList来容纳,每个对象的私有属性
    static ArrayList<String> nameList = new ArrayList<>();
    // 定义一个列表,容纳所有的皇帝实例
    static ArrayList<Emperor> emperorList = new ArrayList<>();
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
