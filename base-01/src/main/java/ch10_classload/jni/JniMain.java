package ch10_classload.jni;

/**
 * 凡是一种语言，都希望是纯。比如解决某一个方案都喜欢就单单这个语言来写即可。
 * Java平台有个用户和本地C代码进行互操作的API，称为Java Native Interface (Java本地接口)。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class JniMain {
    static {
        System.load("D:\\dev\\code\\idea-workspace\\GitHub\\open-guod-javase\\base-01\\src\\main\\java\\ch10_classload\\jni\\libmyjni.dll");
        System.out.println("native...static...");
    }

    // Exception in thread "main" java.lang.UnsatisfiedLinkError: ch10_classload.jni.JniMain01.say()V
    // native关键字告诉JVM，该方法调用的是外部的定义的方法
    // native是与C++联合开发的时候用的！java自己开发不用的
    // 特别注意：需要在src/main/java下执行javah -d d:/ ch10_classload.jni.JniMain01
    // 类比：.h文件就是接口；cpp文件是实现；dll是jar包
    public static native int say(int a, int b);

    public static void main(String[] args) {
        System.out.println(JniMain.say(3, 5));
    }
}