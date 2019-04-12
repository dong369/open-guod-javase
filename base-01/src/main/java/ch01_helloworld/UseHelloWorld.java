package ch01_helloworld;

/**
 * project - 第一个hello world程序
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:01
 * @JDK 1.8
 * @Description 功能模块：
 * 编译命令：javac UseHelloWorld.java
 * 执行命令：java UseHelloWorld
 * <p>
 * 一：window环境配置
 * JAVA_HOME=C:\Program Files\Java\jdk1.8.0_91
 * PATH=%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;%PATH%;
 * CLASSPATH=.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
 * Java11以后：java UseHelloWorld.java
 * <p>
 * 二：Linux环境配置
 * JAVA_HOME=/usr/local/soft/java/jdk1.8
 * JRE_HOME=/usr/local/soft/java/jdk1.8/jre
 * CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME/lib
 * PATH=$PATH:$JAVA_HOME/bin:$JRE_HOME/bin
 * export PATH JAVA_HOME CLASSPATH
 * <p>
 * 区分：JDK/JRE/JVM
 * java -version
 * javac -version
 */
public class UseHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.printf("%d", 34);
    }
}