package ch06_io.threadcopy;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Replicator replicator = new Replicator("d:/test/test.txt", "d:/test/test1.txt", 2);
        replicator.startCopy();
    }
}