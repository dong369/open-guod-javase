package cn.hacz.zookeeper;

import org.apache.zookeeper.ZooKeeper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ZkTest {
    private ZooKeeper zooKeeper;

    @Before
    public void before() throws IOException {
        String zkServer = "s10:2181,s10:2182,s10:2183";
        zooKeeper = new ZooKeeper(zkServer, 5000, null);
    }

    @Test
    public void linkZk() {
        System.out.println(zooKeeper.getSessionId());
    }

    @Test
    public void createZk() {
    }
}
