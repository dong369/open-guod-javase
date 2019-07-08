package datastructure.ch11_union_find.main;

import datastructure.ch11_union_find.ch01_union_find_base.UF;
import datastructure.ch11_union_find.ch02_quick_find.UnionFind01;
import datastructure.ch11_union_find.ch03_quick_union.UnionFind02;

import java.util.Random;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/8 时间:13:56
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        int size = 10000;
        int m = 1000000;
        UnionFind01 uf1 = new UnionFind01(size);
        System.out.println("UnionFind01 : " + testUF(uf1, m) + " s");
        UnionFind02 uf2 = new UnionFind02(size);
        System.out.println("UnionFind02 : " + testUF(uf2, m) + " s");
    }

    private static double testUF(UF uf, int m) {
        int size = uf.getSize();
        Random random = new Random();
        long startTime = System.nanoTime();

        // 合并操作
        for (int i = 0; i < m; i++) {
            int a = random.nextInt(size);
            int b = random.nextInt(size);
            uf.unionElements(a, b);
        }
        // 查找操作
        for (int i = 0; i < m; i++) {
            int a = random.nextInt(size);
            int b = random.nextInt(size);
            uf.isConnected(a, b);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
