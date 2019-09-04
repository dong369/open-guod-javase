package ch05_facade;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:21:01
 * @JDK 1.8
 * @Description 功能模块：积分付款服务
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "支付通过！");
        return true;
    }
}
