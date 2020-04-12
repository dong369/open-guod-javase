package ch14_facade;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "支付通过！");
        return true;
    }
}
