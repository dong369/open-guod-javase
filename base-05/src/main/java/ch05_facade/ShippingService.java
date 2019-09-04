package ch05_facade;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:21:01
 * @JDK 1.8
 * @Description 功能模块：送货服务
 */
public class ShippingService {
    public String ship(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "发货成功！");
        return RandomStringUtils.randomNumeric(12);
    }
}
