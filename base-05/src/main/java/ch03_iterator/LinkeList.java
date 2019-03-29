package ch03_iterator;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:14:47
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LinkeList implements Collection {
	private Node head = null;
	private Node tail = null;
	int size = 0;

	public void add(Object o) {
		Node node = new Node(o, null);
		if (head == null) {
			head = node;
			tail = node;
		}
		tail.setNode(node);
		tail = node;
		size++;
	}

	public int size() {
		return size;
	}

	@Override
	public Iterator iterator() {
		return null;
	}
}
