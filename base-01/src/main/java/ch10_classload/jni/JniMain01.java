package ch10_classload.jni;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/5 时间:12:53
 * @JDK 1.8
 * @Description 功能模块：凡是一种语言，都希望是纯。比如解决某一个方案都喜欢就单单这个语言来写即可。Java平台有个用户和本地C代码进行互操作的API，称为Java Native Interface (Java本地接口)。
 */
public class JniMain01 {
    static {
        System.out.println("native...static...");
    }

    // Exception in thread "main" java.lang.UnsatisfiedLinkError: ch10_classload.jni.JniMain01.say()V
    // native关键字告诉JVM，该方法调用的是外部的定义的方法
    // native是与C++联合开发的时候用的！java自己开发不用的
    public static native void say();

    public static void main(String[] args) {
        JniMain01.say();
    }
}