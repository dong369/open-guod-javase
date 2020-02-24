package ch14_facade;

/**
 * project - 外观模式
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:11:43
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("玫瑰花");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
