package ch03_util.hutool.conver;

import cn.hutool.core.convert.Convert;

/**
 * @author guodd
 * @version 1.0
 */
public class ConvertMain {
    public static void main(String[] args) {
        String s = Convert.toStr(null);
        System.out.println(s);
    }
}
