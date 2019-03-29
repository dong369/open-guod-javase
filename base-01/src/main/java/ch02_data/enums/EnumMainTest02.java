package ch02_data.enums;

/**
 * project - 枚举类型
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/14 时间:13:11
 * @JDK 1.8
 * @Description 功能模块：用法二：向枚举中添加新方法
 */
public enum EnumMainTest02 {
    RED("红色", 1),
    GREEN("绿色", 2),
    BLANK("白色", 3),
    YELLOW("黄色", 4);
    // 成员变量
    private String name;
    private int index;

    // 构造方法
    EnumMainTest02(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (EnumMainTest02 c : EnumMainTest02.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public static void main(String[] args) {
        System.out.println(EnumMainTest02.getName(1));
    }

}
