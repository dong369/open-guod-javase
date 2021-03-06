package ch04_exception.assertinfo;

import org.springframework.util.Assert;

/**
 * 断言
 * 语法：assert <boolean表达式>；assert <boolean表达式> : <错误信息表达式>
 * 注意：Java中的断言默认是关闭状态，启用断言的方式：java -ea TestDemo（按指定的粒度启用断言）；java -esa
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class AssertUse {
    public static void main(String[] args) {
        // 断言1结果为true，则继续往下执行
        assert true;

        Assert.isNull(null, "是空");

        // 断言2结果为false，程序终止
        assert false : "断言失败，此表达式的信息将会在抛出异常的时候输出！";

        Assert.notNull(null, "空");

        System.out.println("停止执行");

        Assert.hasLength("Spring Assert断言", "空数据");
    }
}