package datastructure.ch11_union_find.ch02_quick_find;

import datastructure.ch11_union_find.ch01_union_find_base.UF;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/28 时间:20:39
 * @JDK 1.8
 * @Description 功能模块：Quick Find
 */
public class UnionFind01 implements UF {
    // 集合的编号
    private int[] id;

    public UnionFind01(int size) {
        id = new int[size];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    // 查询元素p所对应的集合编号
    private int find(int p) {
        return id[p];
    }

    @Override
    public int getSize() {
        return id.length;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public void unionElements(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
    }

}