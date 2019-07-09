package datastructure.ch10_trie.ch04_trie_isprefix;

import java.util.TreeMap;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/28 时间:13:29
 * @JDK 1.8
 * @Description 功能模块：字典树、前缀树（）
 */
public class TrieContains {
    private class Node {
        // 是否值单词
        public boolean isWord;
        public TreeMap<Character, Node> next;

        public Node() {
            this(false);
        }

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }
    }

    private Node root;
    private int size;

    public TrieContains() {
        root = new Node();
        size = 0;
    }

    // 存入的单词数量
    public int getSize() {
        return size;
    }

    // 添加单词元素（可以尝试非递归的方式）
    public void add(String word) {
        // 当前节点
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.next.get(c) == null) {
                current.next.put(c, new Node());
            }
            current = current.next.get(c);
        }
        // 之前是不存在的
        if (!current.isWord) {
            current.isWord = true;
            size++;
        }
    }

    // 是否包含某个元素
    public boolean contains(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.next.get(c) == null) {
                return false;
            }
            current = current.next.get(c);
        }
        // 是否已经存在
        return current.isWord;
    }

    // 查询是否在Trie中有单词以prefix为前缀
    public boolean isPrefix(String prefix) {
        Node cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (cur.next.get(c) == null) {
                return false;
            }
            cur = cur.next.get(c);
        }
        return true;
    }
}
