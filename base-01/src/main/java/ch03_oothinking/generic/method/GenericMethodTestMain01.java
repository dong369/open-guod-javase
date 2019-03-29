package ch03_oothinking.generic.method;

/**
 * project - 泛型方法
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:12:51
 * @JDK 1.8
 * @Description 功能模块：写一个函数，调用者传递什么类型的变量，该函数就返回什么类型的变量？
 * 语法格式：public static <泛型的声明标识：可以随便写任意标识号（T、E、K、V），标识指定的泛型的类型> 返回值类型  函数名( 泛型 变量名  ){}
 */
public class GenericMethodTestMain01 {
    public static void main(String[] args) {
        String str = "aaa";
        // 01传统方式，存在强制类型转换
        String o = (String) fun01(str);
        System.out.println(o);
        // 02泛型方式
        String s = fun02(str);
        System.out.println(s);
        // 03泛型方式
        fun03("java", "c", 1);
    }

    private static Object fun01(Object obj) {
        return obj;
    }

    private static <T> T fun02(T t) {
        return t;
    }

    private static <T> void fun03(T... args) {
        for (T t : args) {
            System.out.print(t);
        }
    }

}