package ch06_iterator;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:14:46
 * @JDK 1.8
 * @Description 功能模块：链表节点
 */
public class Node {
	private Object data;
	private Node node;

	public Node() {
	}

	public Node(Object data, Node node) {
		this.data = data;
		this.node = node;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
}
