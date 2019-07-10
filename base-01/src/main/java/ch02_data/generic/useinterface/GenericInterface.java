package ch02_data.generic.useinterface;

/**
 * project - 泛型接口
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:13:08
 * @JDK 1.8
 * @Description 功能模块：
 * 语法格式：interface 类名称 <泛型标识：可以随便写任意标识号（T、E、K、V），标识指定的泛型的类型>{}
 */
public interface GenericInterface<T> {
    void print(T t);
    void show(String t);
}
