package datastructure.ch03_bst.ch01_tree_base.ch01;

/**
 * @author guodd
 * @version 3.0
 */
public class MainTreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(0);
        tree.insert(1);
        tree.insert(2);
        tree.insert(12);
        tree.insert(66);
        tree.insert(33);
        tree.insert(99);
        // 前序遍历
        tree.frontOrder(tree.root);
        System.out.println("===========前序遍历结束==========");
        // 中序遍历
        tree.inOrder(tree.root);
        System.out.println("===========中序遍历结束==========");
        tree.afterOrder(tree.root);
        System.out.println("===========后序遍历结束==========");
    }
}
