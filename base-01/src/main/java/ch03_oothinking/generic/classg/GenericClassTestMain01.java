package ch03_oothinking.generic.classg;

/**
 * project - 泛型类
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:13:01
 * @JDK 1.8
 * @Description 功能模块：使用泛型类，创建对象的时候需要指定具体的类型
 * 语法格式：class 类名称 <泛型标识：可以随便写任意标识号（T、E、K、V），标识指定的泛型的类型>{}
 */
public class GenericClassTestMain01<T> {
    public static void main(String[] args) {
        String java = new GenericClassTestMain01<String>().fun01("java");
        System.out.println(java);
    }

    // 注意：静态方法不可以使用类中定义的泛型；类中的泛型需要在对象初始化时指定具体的类型。
    public T fun01(T t) {
        return t;
    }
}
