package ch05_facade;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:21:00
 * @JDK 1.8
 * @Description 功能模块：合格服务
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "验证通过！");
        return true;
    }
}
