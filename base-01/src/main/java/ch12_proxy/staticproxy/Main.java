package ch12_proxy.staticproxy;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Main {
    public static void main(String[] args) {
        CinemaProxy cinemaProxy = new CinemaProxy(new RealMovie());
        cinemaProxy.play();
    }
}
