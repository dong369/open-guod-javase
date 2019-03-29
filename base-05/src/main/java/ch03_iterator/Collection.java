package ch03_iterator;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:14:59
 * @JDK 1.8
 * @Description 功能模块：容器的可替换性
 */
public interface Collection {
	void add(Object o);

	int size();

	Iterator iterator();
}
