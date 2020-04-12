package ch14_facade;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "验证通过！");
        return true;
    }
}
