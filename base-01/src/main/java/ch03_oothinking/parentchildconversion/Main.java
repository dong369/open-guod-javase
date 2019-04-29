package ch03_oothinking.parentchildconversion;

import ch03_oothinking.classinitorder.extendsclass.Child;
import ch03_oothinking.classinitorder.extendsclass.Parent;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * project -
 *
 * @author yanfa07
 * @version 1.0
 * @date 日期:2019/4/29 时间:8:14
 * @JDK 1.8
 * @Description 功能模块：父子转换
 * 想让父类强制转换成子类，不是没有可能，除非父类是子类构造出来的实例，不然是不能强转的。
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();
        child = (Child) parent;
    }
}
