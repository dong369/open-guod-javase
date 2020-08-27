package ch12_proxy.jdkproxy;

/**
 * 委托类
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Student implements StudentInterface {
    @Override
    public void study() {
        System.out.println("study...");
    }

    @Override
    public void play() {
        System.out.println("play...");
    }

    @Override
    public void sleep() {
        System.out.println("sleep...");
    }
}
