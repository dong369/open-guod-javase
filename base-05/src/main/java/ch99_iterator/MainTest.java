package ch99_iterator;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:45
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        // 面向接口编程，提高程序的灵活性
        Collection<String> collection = new ArrayList<>();
        Collection<String> collection1 = new LinkedList<>();
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
