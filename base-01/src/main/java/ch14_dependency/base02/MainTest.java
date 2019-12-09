package ch14_dependency.base02;

import ch14_dependency.base01.Father;
import org.apache.commons.lang.ObjectUtils;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/31 时间:13:08
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(ObjectUtils.toString(new Father()));
    }
}
