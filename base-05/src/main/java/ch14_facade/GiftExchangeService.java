package ch14_facade;

/**
 * @author guodd
 * @version 1.0
 * 礼品兑换服务
 */
class GiftExchangeService implements FacadeI {
    private final QualifyService qualifyService = new QualifyService();
    private final PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private final ShippingService shippingService = new ShippingService();

    @Override
    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                String ship = shippingService.ship(pointsGift);
                System.out.println("订单号：" + ship);
            }
        }
    }
}
