package ch08_bridge;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:10:30
 * @JDK 1.8
 * @Description 功能模块：彪悍的礼物
 */
public class WildGift extends Gift {
	public WildGift(GiftImpl giftImpl) {
		this.giftImpl = giftImpl;
	}
}
