package ch11_iterator;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:14:50
 * @JDK 1.8
 * @Description 功能模块：实现统一的遍历
 */
public interface Iterator<T> {
	T next();

	boolean hasNext();
}
