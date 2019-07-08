package datastructure.ch11_union_find.ch04_union_size;

import datastructure.ch11_union_find.ch01_union_find_base.UF;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/8 时间:13:47
 * @JDK 1.8
 * @Description 功能模块：
 */
public class UnionFind03 implements UF {
    private int[] parent;
    // 每一个根对应节点的个数。
    private int[] size;

    public UnionFind03() {
    }

    public UnionFind03(int[] parent) {
        this.parent = parent;
    }

    public UnionFind03(int size) {
        parent = new int[size];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

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
