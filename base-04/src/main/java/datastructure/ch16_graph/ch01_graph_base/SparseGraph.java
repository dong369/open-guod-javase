package datastructure.ch16_graph.ch01_graph_base;

import java.util.Vector;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/8 时间:16:01
 * @JDK 1.8
 * @Description 功能模块：稀疏图-邻接表
 */
public class SparseGraph {
    private int n;
    private int e;
    private boolean to;
    private Vector<Integer>[] g;

    public SparseGraph(int n, boolean to) {
        assert n >= 0;
        this.n = n;
        this.to = to;
        this.e = 0;
        g = (Vector<Integer>[]) new Vector[n];
        for (int i = 0; i < n; i++) {
            g[i] = new Vector<>();
        }

    }

    // 节点数
    private int N() {
        return n;
    }

    // 边数
    public int E() {
        return e;
    }

    public static void main(String[] args) {
        SparseGraph sparseGraph = new SparseGraph(-4, true);
        System.out.println(sparseGraph.N());
        System.out.println(sparseGraph.E());
    }
}
