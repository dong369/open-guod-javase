package ch08_bridge;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:10:26
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Boy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pursue(Girl girl) {
        Gift gift = new WarmGift(new Flower());
        give(girl, gift);
    }

    public void give(Girl girl, Gift gift) {
    }
}
