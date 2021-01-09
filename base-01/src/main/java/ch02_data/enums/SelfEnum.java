package ch02_data.enums;

/**
 * The class/interface 自定义枚举类
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class SelfEnum {
    // 1、声明对象属性，private final
    private final String seasonName;
    private final String seasonDesc;

    // 2、私有化构造方法，给属性赋值
    private SelfEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 3、提供当前枚举类的多个对象
    public static final SelfEnum SPRING = new SelfEnum("春天", "春暖花开");
    public static final SelfEnum SUMMER = new SelfEnum("夏天", "春暖花开");

    // 4、枚举类对象属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    // 5、toString

    @Override
    public String toString() {
        return "SelfEnum{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    // 测试
    public static void main(String[] args) {
        SelfEnum a = SelfEnum.SPRING;
        System.out.println(a.getSeasonName());
        System.out.println(a.getSeasonDesc());
    }
}
