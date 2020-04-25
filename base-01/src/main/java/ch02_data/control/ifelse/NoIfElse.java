package ch02_data.control.ifelse;

import ch02_data.control.ifelse.enuminfo.EnumInfo;

/**
 * The class/interface 去除代码中的if/else
 * 1、switch
 * 2、通过枚举类型
 * 3、工厂方法模式
 * 4、策略模式、命令模式
 * 5、规则引擎
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class NoIfElse {
    public static void main(String[] args) {
        ifElse("aa");
        switchUse("bb");
        EnumInfo.valueOf("aa").apply();
    }

    // 传统方式
    public static void ifElse(String str) {
        if ("aa".equals(str)) {
            System.out.println("aa");
        } else if ("bb".equals(str)) {
            System.out.println("bb");
        } else if ("cc".equals(str)) {
            System.out.println("cc");
        } else {
            System.out.println("other");
        }
    }

    // switch
    public static void switchUse(String str) {
        switch (str) {
            case "aa":
                System.out.println("aa");
                break;
            case "bb":
                System.out.println("bb");
                break;
            case "cc":
                System.out.println("cc");
                break;
            default:
                System.out.println("other");
        }
    }
}
