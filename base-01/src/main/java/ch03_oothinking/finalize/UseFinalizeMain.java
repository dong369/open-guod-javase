package ch03_oothinking.finalize;

/**
 * finalize关键字
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 * {@link System} call gc时，由垃圾回收器调用finalize
 */
public class UseFinalizeMain {
    public static void main(String[] args) {
        System.gc();
    }
}
