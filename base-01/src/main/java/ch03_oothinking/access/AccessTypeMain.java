package ch03_oothinking.access;

/**
 * public：当前类、同包、子类、其他包
 * protected：当前类、同包、子类
 * default：当前类、同包
 * private：当前类
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:10:29
 * @since 1.8
 */
public class AccessTypeMain {
    public int a;
    protected int b;
    int c;
    private int d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}