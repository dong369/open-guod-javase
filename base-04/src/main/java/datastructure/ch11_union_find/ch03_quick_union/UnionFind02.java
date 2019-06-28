package datastructure.ch11_union_find.ch03_quick_union;

import datastructure.ch11_union_find.ch01_union_find_base.UF;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/28 时间:20:58
 * @JDK 1.8
 * @Description 功能模块：
 */
public class UnionFind02 implements UF {
    private int[] parent;

    public UnionFind02(int size) {
        parent = new int[size];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    // 查找过程，查找元素p所对应的集合标号
    // O(h)的时间复杂度，h为树的深度
    public int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    // O(h)的时间复杂度，h为树的深度
    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        parent[pRoot] = qRoot;
    }

    @Override
    public int getSize() {
        return parent.length;
    }
}
