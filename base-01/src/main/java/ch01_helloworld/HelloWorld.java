package ch01_helloworld;

/**
 * project - 第一个hello world程序
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:01
 * @JDK 1.8
 * @Description 功能模块：
 * 编译命令：javac HelloWorld.java
 * 执行命令：java HelloWorld
 * JAVA_HOME=C:\Program Files\Java\jdk1.8.0_91
 * PATH=%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;%PATH%;
 * CLASSPATH=.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
 * Java11以后：java HelloWorld.java
 * 区分：JDK/JRE/JVM
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}