package ch18_bridge;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:10:32
 * @JDK 1.8
 * @Description 功能模块：温暖的礼物
 */
public class WarmGift extends Gift {
	public WarmGift(GiftImpl giftImpl) {
		this.giftImpl = giftImpl;
	}
}
