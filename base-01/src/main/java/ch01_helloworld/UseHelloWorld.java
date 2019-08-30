package ch01_helloworld;

/**
 * project - 第一个hello world程序（硬件+软件+图灵+冯诺依曼体系结构）
 * <p>
 * 创始人：Java之父——詹姆斯·高斯林出生于加拿大，是一位计算机编程天才。
 * 创建日期：1995年5月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏览器。
 * <p>
 * IT定律之计算机行业发展规律
 * 摩尔定律( Moore's Law)：意指集成电路上可容纳的元器件的数量每隔18至24个月就会增加一倍，性能也将提升一倍。
 * 安迪比尔定律( Andy and Bill's Law）：硬件提高的性能，很快被软件消耗掉了。
 * 反摩尔定律( Reverse Moore's law）：如果你反过来看摩尔定律，一个IT公司如果今天和18个月前卖掉同样多的、同样的产品，它的营业额就要降一半。
 * <p>
 * CPU：运行时首先会去自身的缓存中寻找，如果没有再去内存中找。
 * 缓存：会记录一些常用的数据等信息，以免每次都要到内存中，节省了时间，提高了效率。
 * 内存：作为与CPU直接进行沟通的部件，所有的程序都是在内存中运行的。
 * 硬盘：数据会先写入内存才能被CPU使用。
 * 内存（memory）+缓存（cache） -> 内存储空间
 * 硬盘 -> 外存储空间
 * <p>
 * 8比特（bit）=1字节（byte）
 * 比特：是计算机最小的存储单位
 * 字节：计算机最基本的存储单位
 * <p>
 * 1千字节=1024B
 * 1兆字节=1024KB
 * 1千兆字节=1024MB
 * 1万亿字节=1024GB
 * PB/EB/ZB/YB
 * <p>
 * 万维网<因特网<互联网
 * <p>
 * 第一层次：看得懂(依赖于视频、书、贴子)
 * 第二层次：练的熟(每天代码必须实现2-3遄)
 * 总结：三分看,七分练
 * <p>
 * 思考/总结/笔记
 * <p>
 * 代码虐我百遍，我视代码如初恋。
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:01
 * @JDK 1.8
 * @Description 功能模块：
 * 编译命令：javac UseHelloWorld.java
 * 执行命令：java UseHelloWorld
 * <p>
 * 一：window环境配置（JDK的根目录、可执行文件bin、类文件）
 * JAVA_HOME=C:\Program Files\Java\jdk1.8.0_91
 * PATH=%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;%PATH%;
 * CLASSPATH=.;%JAVA_HOME%\lib\tools.jar;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib
 * Java11以后：java UseHelloWorld.java
 * <p>
 * 二：Linux环境配置
 * JAVA_HOME=/usr/local/soft/java/jdk1.8
 * JRE_HOME=/usr/local/soft/java/jdk1.8/jre
 * PATH=$PATH:$JAVA_HOME/bin:$JRE_HOME/bin
 * CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME/lib
 * export PATH JAVA_HOME CLASSPATH
 * <p>
 * 三：区分：JDK/JRE/JVM
 * java -version
 * javac -version
 */
public class UseHelloWorld {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Hello World!");
        System.out.printf("%d", 34);
    }
}