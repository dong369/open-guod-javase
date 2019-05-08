package ch04_hutool.conver;

import cn.hutool.core.convert.Convert;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/28 时间:8:35
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ConvertMain {
    public static void main(String[] args) {
        String s = Convert.toStr(null);
        System.out.println(s);
    }
}
