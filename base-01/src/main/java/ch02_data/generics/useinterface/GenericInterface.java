package ch02_data.generics.useinterface;

/**
 * project - 泛型接口
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 * 语法格式：interface 接口名称 <泛型标识：可以随便写任意标识号（T、E、K、V），标识指定的泛型的类型>{}
 */
public interface GenericInterface<T> {
    void print(T t);

    void show(String t);
}
