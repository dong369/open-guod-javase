package ch13_proxy.staticproxy;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/2/19
 * @since 1.8
 */
public class ServerProxy implements NetWord {
    private Object o;

    public ServerProxy(Object o) {
        this.o = o;
    }

    @Override
    public void browse() {
        System.out.println("start...");
        Server s = (Server) o;
        s.browse();
        System.out.println("end...");
    }
}
