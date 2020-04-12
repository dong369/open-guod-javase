package ch14_facade;

/**
 * project - 外观模式
 *
 * @author guodd
 * @version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("玫瑰花");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
