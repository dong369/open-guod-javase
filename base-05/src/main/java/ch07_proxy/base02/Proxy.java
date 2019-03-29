package ch07_proxy.base02;

/**
 * project - 代理模式
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/11 时间:21:50
 * @JDK 1.8
 * @Description 功能模块：如何动态编译：jdk1.6 compiler API；CGLib；ASM
 */
public class Proxy {
    public static Object newProxyInstance(Class intce) throws Exception {
        String s = "package ch07_proxy.base01;" +
                "public class TakenLogProxy implements " + intce.getName() + " {\n" +
                "    public TakenLogProxy(Moveable taken) {\n" +
                "        super();\n" +
                "        this.taken = taken;\n" +
                "    }\n" +
                "\n" +
                "    Moveable taken;\n" +
                "\n" +
                "    @Override\n" +
                "    public void move() throws InterruptedException {\n" +
                "        System.out.println(\"logger start\");\n" +
                "        taken.move();\n" +
                "        System.out.println(\"logger end\");\n" +
                "    }\n" +
                "}";
        return null;
    }
}