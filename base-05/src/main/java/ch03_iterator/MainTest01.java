package ch03_iterator;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:45
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest01 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkeList linkeList = new LinkeList();
		// 面向接口编程，提高程序的灵活性
		Collection collection = new ArrayList();
		Collection collection1 = new LinkeList();
		for (int i = 0; i < 15; i++) {
			collection.add("java");
		}
		System.out.println(collection.size());
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
	}
}
