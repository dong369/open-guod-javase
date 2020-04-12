package ch02_data.enums;

import org.junit.Test;

/**
 * 枚举类型，用法一：常量
 *
 * @author guod
 * @version 1.0
 */
public enum EnumMain01 {
    RED,
    GREEN,
    BLANK,
    YELLOW;

    @Test
    public void main() {
        System.out.println(EnumMain01.RED);
    }
}