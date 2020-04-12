package ch03_oothinking.parentchildconversion;

import ch03_oothinking.initorder.extendsclass.Child;
import ch03_oothinking.initorder.extendsclass.Parent;

/**
 * 父子转换
 * 想让父类强制转换成子类，不是没有可能，条件是父类是子类构造出来的实例，不然是不能强转的。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();
        child = (Child) parent;
    }
}
