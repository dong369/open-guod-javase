package jdk.jdk8.functioninterface;

/**
 * project - 函数式接口
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/8 时间:19:48
 * @JDK 1.8
 * @Description 功能模块：
 */
public class FunctionInterfaceMain {

    private static String joinStr(String str, FunctionInterfaceTest01 functionTest) {
        return functionTest.getInfo(str);
    }

    private static String getInstance(String item) {
        return item + "！世界";
    }

    private static String getMessage(String massage) {
        return "世界," + massage + "!";
    }

    public static void main(String[] args) {
        /**
         * 1、lambda表达式
         * 这种形式最为直观，lambda表达式，接收一个String类型的参数，返回一个String类型的结果。
         * 完全符合函数式接口FunctionInterfaceTest的定义
         */
        FunctionInterfaceTest01 functionInterfaceTest1 = item -> item + 1;
        System.out.println(functionInterfaceTest1);
        /**
         * 2、方法引用
         * Main方法当中的getInstance和getMessage方法接收一个参数，返回一个结果。符合函数式接口FunctionInterfaceTest*的定义。
         * 函数式接口只是定义了个方法的[约定]（接收一个String类型的参数，返回一个String类型的结果），
         * 而对于方法内部进行何种操作则并没有做任何的限制。在这点上，跟java以前的版本中的实现类与接口之间的关系很类似。
         * 不同的是，函数式接口更偏重于[计算过程]，约束了一个计算过程的输入和输出。
         * 这种约束计算过程的输入和输出的形式的好处可以看一下joinStr方法。
         */
        FunctionInterfaceTest01 functionInterfaceTest2 = FunctionInterfaceMain::getInstance;
        /**
         * 3、构造方法引用
         * 构造函数的结构：接收输入参数，然后返回一个对象。这种约束跟函数式接口的约束很像。
         * 所以只要“输入参数类型”与“输出参数类型”跟FunctionInterfaceTest中的方法约束相同，
         * 就可以创建出FunctionInterfaceTest接口的实例，如下，String的构造方法中有
         * new String(str)的构造方法，所以可以得到实例。
         * 这里存在一个类型推断的问题，JDK的编译器已经帮我们自动找到了只有一个参数，且是String类型的构造方法。
         * 这就是我们直接String::new，没有指定使用哪一个构造方法，却可以创建实例的原因
         */
        FunctionInterfaceTest01 functionInterfaceTest3 = FunctionInterfaceMain::getMessage;

        String msg1 = joinStr("你好", functionInterfaceTest2);
        String msg2 = joinStr("你好", functionInterfaceTest3);
        System.out.println(msg1);
        System.out.println(msg2);

        //输出：你好！世界
        String msg3 = joinStr("你好", item -> item + "！世界");
        //输出：世界，你好！
        String msg4 = joinStr("你好", item -> "世界," + item + "!");
        System.out.println(msg3);
        System.out.println(msg4);

        FunctionInterfaceTest01 functionInterfaceTest4 = String::new; //方法引用
        System.out.println(functionInterfaceTest4);

    }
}