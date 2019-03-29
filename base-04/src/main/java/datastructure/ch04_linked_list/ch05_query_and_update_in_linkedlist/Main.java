package datastructure.ch04_linked_list.ch05_query_and_update_in_linkedlist;

/**
 * project -
 *
 * @author Administrator
 * @version 1.0
 * @date 日期:2019/1/30 时间:21:44
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println(linkedList.contains(4));
    }

}
