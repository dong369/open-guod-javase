package ch03_oothinking.access;

import lombok.Data;

/**
 * public：当前类、同包、子类、其他包
 * protected：当前类、同包、子类
 * default：当前类、同包
 * private：当前类
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
@Data
public class AccessTypeMain {
    public int a;
    protected int b;
    int c;
    private int d;
}