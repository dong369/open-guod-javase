package ch16_flyweight;

import org.apache.commons.lang.math.RandomUtils;

/**
 * project - Github开源项目
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/8/8 时间:7:58
 * @JDK 1.8
 * @Description 功能模块：设计模式-模板方法模式
 */
public abstract class AbstractBusiness {
    /**
     * 功能描述：模板方法
     */
    public final void execute() {
        // getRowNumber();
        // //如果顾客是vip，则不用排队
        if (!isVip()) {
            getRowNumber();
        }
        handle();
        judge();
    }

    /**
     * 功能描述：取号
     */
    private void getRowNumber() {
        System.out.println("请" + RandomUtils.nextInt() + "号客户办理业务");
    }

    /**
     * 功能描述：办理业务
     */
    public abstract void handle(); //抽象的办理业务方法，由子类实现

    /**
     * 功能描述：评价
     */
    private void judge() {
        System.out.println("业务办理结束，给个好评！");
    }

    /**
     * 功能描述：抽象的钩子方法，由子类实现
     *
     * @return
     */
    public abstract boolean isVip();

}
