package datastructure.ch02_linked.ch06_query_and_update_in_linkedlist;

/**
 * @author guodd
 * @version 1.0
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
