package datastructure.ch11_union_find.ch01_union_find_base;

/**
 * 并查集，连接问题。
 *
 * @author guodd
 * @version 1.0
 */
public interface UF {
    // 查看元素p和元素q是否所属一个集合
    boolean isConnected(int p, int q);

    // 合并元素p和元素q所属的集合，时间复杂度O(n)
    void unionElements(int p, int q);

    // 元素数
    int getSize();
}
