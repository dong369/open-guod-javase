package ch08_network.uri;

import java.net.URI;
import java.net.URL;

public class UriMain {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("http://www.baidu.com");
        URL url = uri.toURL();
        url.openStream();
    }
}
