package datastructure.ch10_trie.ch01_trie_base;

import java.util.TreeMap;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/28 时间:13:29
 * @JDK 1.8
 * @Description 功能模块：字典树、前缀树（垂翼）
 */
public class Trie {
    private class Node {
        // 是否值单词
        private boolean isWord;
        private TreeMap<Character, Node> next;

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

    public Trie() {
        root = new Node();
        size = 0;
    }

    // 存入的单词数量
    public int getSize() {
        return size;
    }
}
