package datastructure.ch10_trie.ch03_trie_contains;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/28 时间:14:30
 * @JDK 1.8
 * @Description 功能模块：
 */
public class TrieMain {
    public static void main(String[] args) {
        TrieContains trie = new TrieContains();
        trie.add("test01");
        trie.add("test");
        trie.add("test");
        trie.add("test");
        System.out.println(trie.getSize());
    }
}
