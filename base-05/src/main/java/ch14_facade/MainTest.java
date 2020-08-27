package ch14_facade;

/**
 * project - 外观模式
 *
 * @author guodd
 * @version 1.0
 * @see org.springframework.jdbc.support.JdbcUtils
 * @see mybatis中的Configuration
 */
public class MainTest {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("玫瑰花");
        FacadeI facadeI = new GiftExchangeService();
        facadeI.giftExchange(pointsGift);
    }
}
