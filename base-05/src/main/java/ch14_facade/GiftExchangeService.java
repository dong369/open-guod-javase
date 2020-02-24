package ch14_facade;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:20:59
 * @JDK 1.8
 * @Description 功能模块：礼品兑换服务
 */
class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                String ship = shippingService.ship(pointsGift);
                System.out.println("订单号：" + ship);
            }
        }
    }
}
