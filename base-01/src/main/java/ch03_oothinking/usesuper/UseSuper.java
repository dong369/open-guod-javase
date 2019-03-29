package ch03_oothinking.usesuper;

/**
 * project -
 *
 * @author Administrator
 * @version 1.0
 * @date 日期:2019/3/2 时间:17:02
 * @JDK 1.8
 * @Description 功能模块：关键字super，this()和super()都指的是对象，所以，均不可以在static环境中使用。包括：static变量,static方法，static语句块。
 * this和super不能同时出现在一个构造函数里面，因为this必然会调用其它的构造函数，其它的构造函数必然也会有super语句的存在，所以在同一个构造函数里面有相同的语句，就失去了语句的意义，编译器也不会通过。
 */
public class UseSuper {
    public UseSuper() {
        super();
    }
}
