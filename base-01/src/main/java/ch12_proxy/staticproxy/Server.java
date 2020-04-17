package ch12_proxy.staticproxy;


/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/2/19
 * @since 1.8
 */
public class Server implements NetWord {
    @Override
    public void browse() {
        System.out.println("server...browse");
    }
}
