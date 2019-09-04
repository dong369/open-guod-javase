package ch18_bridge;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:10:27
 * @JDK 1.8
 * @Description 功能模块：礼物
 */
public class Gift {
	protected GiftImpl giftImpl;

	public GiftImpl getGiftImpl() {
		return giftImpl;
	}

	public void setGiftImpl(GiftImpl giftImpl) {
		this.giftImpl = giftImpl;
	}
}
