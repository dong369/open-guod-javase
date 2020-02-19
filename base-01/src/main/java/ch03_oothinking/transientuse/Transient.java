package ch03_oothinking.transientuse;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/22 时间:16:12
 * @JDK 1.8
 * @Description 功能模块：序列化
 * 1）transient修饰的变量不能被序列化；
 * 2）transient只作用于实现 Serializable 接口；
 * 3）transient只能用来修饰普通成员变量字段；
 * 4）不管有没有 transient 修饰，静态变量都不能被序列化；
 */
public class Transient {
    private transient int a = 1;
}
