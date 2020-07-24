package ch12_proxy.staticproxy;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class CinemaProxy implements Movie {

    RealMovie realMovie;

    public CinemaProxy(RealMovie realMovie) {
        this.realMovie = realMovie;
    }

    @Override
    public void play() {
        info(true);
        realMovie.play();
        info(false);
    }

    public void info(boolean flag) {
        if (flag) {
            System.out.println("开始广告...");
        } else {
            System.out.println("结束广告...");
        }
    }
}
