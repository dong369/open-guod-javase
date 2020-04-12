package ch14_facade;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class ShippingService {
    public String ship(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "发货成功！");
        return RandomStringUtils.randomNumeric(12);
    }
}
