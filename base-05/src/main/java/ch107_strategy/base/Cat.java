package ch107_strategy.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:16:10
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Cat implements Comparable {
	private int height;
	private int weigh;

	private Comparator comparator = new CatHeightComparator();

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

	@Override
	public int compareTo(Object o) {
		return comparator.compare(this, o);
	}
}
