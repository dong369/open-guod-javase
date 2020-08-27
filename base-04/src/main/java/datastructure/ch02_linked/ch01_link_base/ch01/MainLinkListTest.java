package datastructure.ch02_linked.ch01_link_base.ch01;

/**
 * @author guod
 * @version 1.0
 * 链表
 */
public class MainLinkListTest {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1);
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(4);
        linkList.insertFirst(5);
        linkList.display();
        linkList.deleteFirst();
        linkList.display();
        Node node = linkList.find(2);
        node.display();
        Node deleteNode = linkList.delete(3);
        deleteNode.display();
        linkList.display();
    }
}
