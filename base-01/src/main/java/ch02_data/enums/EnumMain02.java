package ch02_data.enums;

import lombok.*;

/**
 * 用法二：向枚举中添加新方法
 *
 * @author guod
 * @version 1.0
 */
@Getter
public enum EnumMain02 {
    /*RED("红色", 1),
    GREEN("绿色", 2),
    BLANK("白色", 3),
    YELLOW("黄色", 4);

    // 成员变量
    private String name;
    private int index;

    public static String getName(int index) {
        for (EnumMain02 c : EnumMain02.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(EnumMain02.RED.getName());
        System.out.println(EnumMain02.RED.getIndex());
        System.out.println(EnumMain02.getName(4));
    }*/
}
