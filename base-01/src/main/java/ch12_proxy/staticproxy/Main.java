package ch12_proxy.staticproxy;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/2/19
 * @since 1.8
 */
public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        ServerProxy serverProxy = new ServerProxy(server);
        serverProxy.browse();
    }
}