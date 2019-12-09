package ch14_dependency.base01;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:09
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Human {
    /**
     * Human中使用了Father的实例，产生了对Father依赖
     */
    private Father father;

    /**
     * 主动初始化依赖，耦合严重
     */
    public Human() {
        father = new Father();
    }
}
