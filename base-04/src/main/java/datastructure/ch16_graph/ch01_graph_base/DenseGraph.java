package datastructure.ch16_graph.ch01_graph_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/8 时间:16:01
 * @JDK 1.8
 * @Description 功能模块：密集图-邻接矩阵
 */
public class DenseGraph {
    private int n;  // 节点数
    private int e;  // Edge边数
    private boolean directed;   // 是否为有向图
    private boolean[][] g;      // 图的具体数据

    private DenseGraph(int n, boolean directed) {
        assert n >= 0;
        this.n = n;
        this.directed = directed;
        this.e = 0;    // 初始化没有任何边
        // g初始化为n*n的布尔矩阵, 每一个g[i][j]均为false, 表示没有任和边
        // false为boolean型变量的默认值
        g = new boolean[n][n];
    }

    // 节点数
    private int N() {
        return n;
    }

    // 边数
    public int E() {
        return e;
    }

    // 验证图中是否有从v到w的边
    private boolean hasE(int v, int w) {
        assert v >= 0 && v < n;
        assert w >= 0 && w < n;
        return g[v][w];
    }

    // 向图中添加一个边
    private void addEdge(int v, int w) {
        assert v >= 0 && v < n;
        assert w >= 0 && w < n;
        if (hasE(v, w))
            return;
        g[v][w] = true;
        if (!directed)
            g[w][v] = true;
        e++;
    }

    public static void main(String[] args) {
        DenseGraph denseGraph = new DenseGraph(4, true);
        denseGraph.addEdge(1, 3);
        System.out.println(denseGraph.N());
        System.out.println(denseGraph.E());
        System.out.println(denseGraph.hasE(3, 1));
    }
}
