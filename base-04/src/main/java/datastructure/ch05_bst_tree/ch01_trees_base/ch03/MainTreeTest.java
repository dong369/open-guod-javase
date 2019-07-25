package datastructure.ch05_bst_tree.ch01_trees_base.ch03;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/18 时间:9:02
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(12);
        tree.insert(1);
        tree.insert(55);
        tree.insert(5);
        System.out.println(tree.root.data);
        System.out.println(tree.root.leftChild.data);
        System.out.println(tree.root.leftChild.rightChild.data);
        Node node = tree.find(55);
        System.out.println(node.data);
    }
}
