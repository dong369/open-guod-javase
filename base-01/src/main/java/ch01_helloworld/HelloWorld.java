package ch01_helloworld;

/**
 * Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。
 * 编程是为了解决某个问题而使用某种程序设计语言编写程序代码，并最终得到预期结果。
 * <p>
 * 第一个hello world程序（硬件+软件+图灵+冯诺依曼体系结构）
 * 跨平台性：是指Java语言编写的程序，一次编译后，可以在多个系统平台上运行，本质是JVM跨平台。
 * 编码标准：Java语言采用Unicode编码标准，Unicode（标准码），它为每个字符制订了一个唯一的数值，因此在任何的语言、平台、程序都可以放心的使用。
 * 运行步骤：Java源代码->编译器->JVM可执行的Java字节码(即虚拟指令)->JVM->JVM中解释器->机器可执行的二进制机器码->程序运行。
 * 字节码：Java源代码经过虚拟机编译器编译后产生的文件（即扩展为.class的文件），它不面向任何特定的处理器，只面向虚拟机。
 * <p>
 * 创始人：Java之父——詹姆斯·高斯林出生于加拿大，是一位计算机编程天才。
 * 创建日期：1995年5月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏览器。
 * <p>
 * IT定律之计算机行业发展规律
 * 摩尔定律(Moore's Law)：意指集成电路上可容纳的元器件的数量每隔18至24个月就会增加一倍，性能也将提升一倍。
 * 反摩尔定律(Reverse Moore's law）：如果你反过来看摩尔定律，一个IT公司如果今天和18个月前卖掉同样多的、同样的产品，它的营业额就要降一半。
 * 安迪比尔定律(Andy and Bill's Law）：硬件提高的性能，很快被软件消耗掉了。
 * <p>
 * CPU：运行时首先会去自身的[缓存]中寻找，如果没有再去内存中找。
 * 缓存（cache）：CPU的Cache，它中文名称是高速缓冲存储器，会记录一些常用的数据等信息，以免CPU每次都要到内存中，节省了时间，提高了效率，偏重读。
 * 缓冲（buffer）：缓冲区(buffer)，它是内存空间的一部分，在内存空间中预留了一定的存储空间，偏重写。
 * 内存（memory）：作为与CPU直接进行沟通的部件，所有的程序都是在内存中运行的。
 * 硬盘（disk）：数据会先写入内存才能被CPU使用。
 * 内存（memory）+缓存（cache）-> 内存储空间
 * 硬盘 -> 外存储空间
 * <p>
 * 8比特（bit）=1字节（byte）
 * 比特是计算机最小的存储单位；字节是计算机最基本的存储单位。
 * <p>
 * Byte、KB、MB、GB、TB、PB、EB、ZB、YB、DB、NB
 * 1 Byte = 8 Bit
 * 1 KB = 1,024 Bytes
 * 1 MB = 1,024 KB = 1,048,576 Bytes
 * 1 GB = 1,024 MB = 1,048,576 KB = 1,073,741,824 Bytes
 * 1 TB = 1,024 GB = 1,048,576 MB = 1,073,741,824 KB = 1,099,511,627,776 Bytes
 * 1 PB = 1,024 TB = 1,048,576 GB =1,125,899,906,842,624 Bytes （13107.2个80G的
 * 1 EB = 1,024 PB = 1,048,576 TB = 1,152,921,504,606,846,976 Bytes
 * 1 ZB = 1,024 EB = 1,180,591,620,717,411,303,424 Bytes
 * 1 YB = 1,024 ZB = 1,208,925,819,614,629,174,706,176 Bytes
 * <p>
 * 万维网 < 因特网 < 互联网
 * <p>
 * 第一层次：看得懂(依赖于视频、书、贴子)
 * 第二层次：练的熟(每天代码必须实现2-3遄)
 * 总结：三分看，七分练
 * 逻辑性代码 vs 功能性代码
 * <p>
 * 思考/总结/笔记
 * <p>
 * 代码虐我百遍，我视代码如初恋。
 * <p>
 * 编译命令：javac UseHelloWorld.java
 * 执行命令：java UseHelloWorld
 * <p>
 * 一、window环境配置（JDK的根目录、可执行文件bin、类文件）
 * JAVA_HOME=D:\dev\soft\JDK\jdk-11.0.6
 * PATH=%JAVA_HOME%\bin;
 * CLASSPATH=.;%JAVA_HOME%\lib\tools.jar;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib
 * Java11以后：java UseHelloWorld.java
 * <p>
 * 二、Linux环境配置
 * JAVA_HOME=/usr/local/soft/java/jdk1.8
 * JRE_HOME=/usr/local/soft/java/jdk1.8/jre
 * PATH=$PATH:$JAVA_HOME/bin:$JRE_HOME/bin
 * CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME/lib
 * export PATH JAVA_HOME CLASSPATH
 * <p>
 * 三、JVM、JRE和JDK的关系和区分？
 * JVM：Java Virtual Machine 是Java虚拟机，Java程序需要运行在虚拟机上，不同的平台有自己的虚拟机，因此Java语言可以实现跨平台。
 * JRE：Java Runtime Environment包括Java虚拟机和Java程序所需的核心类库等。
 * JDK：Java Development Kit是提供给Java开发人员使用的，其中包含了Java的开发工具，也包括了JRE。
 * javac -version
 * java -version
 * javap -c HelloWorld.class
 * <p>
 * 四、什么是 Java 程序的主类？应用程序和小程序的主类有何不同？
 * 一个程序中可以有多个类，但只能有一个类是主类。在 Java 应用程序中，这个主类是指包含 main() 方法的类。
 * 在 Java 小程序中，这个主类是一个继承自系统类 JApplet 或 Applet 的子类。
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class HelloWorld {
    public static void main(String[] args) {
        float a = 1.2F;
        double b = 1.2D;
        System.out.println(b - a);
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Hello World!你好世界");
        System.out.printf("%d", 34);
    }
}