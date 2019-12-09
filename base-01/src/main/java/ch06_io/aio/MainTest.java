package ch06_io.aio;

/**
 * project - 异步非阻塞IO，AIO引入异步通道的概念，采用了Proactor模式，简化了程序编写，有效的请求才启动线程，
 * 它的特点是先由操作系统完成后才通知服务端程序启动程序去处理，一般适合用于连接数较多且连接时间较长的应用。
 * 不常用，所以这里不做过多讲解。
 * <p>
 * 使用场景：AIO适用于连接数多且连接时间较长的架构。编程较复杂，JDK1.7开始支持。
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/10/31 时间:22:05
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
}
