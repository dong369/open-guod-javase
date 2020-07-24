package ch12_proxy.staticproxy;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class RealMovie implements Movie{
    @Override
    public void play() {
        System.out.println("播放电影《极盗者》");
    }
}
