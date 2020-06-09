package cn.hacz.zookeeper;

import org.apache.zookeeper.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ZkTest {
    String zkServer = "s10:2181,s10:2182,s10:2183";
    private ZooKeeper zk;

    @Before
    public void before() throws IOException {
        zk = new ZooKeeper(zkServer, 5000, null);
    }

    @Test
    public void create() throws Exception {
        if (StringUtils.isEmpty(zk.exists("/test", null))) {
            String s = zk.create("/test", "java".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            System.out.println(s);
        }
    }

    @Test
    public void deleteZk() throws Exception {
        // dataVersion = 1
        zk.delete("/test", 1);
    }

    @Test
    public void zkTree() throws Exception {
        printZNode("/");
    }

    private void printZNode(String path) throws Exception {
        System.out.println(path);
        List<String> list = zk.getChildren(path, false);
        if (path.equals("/")) {
            path = "";
        }
        for (String p : list) {
            printZNode(path + "/" + p);
        }
    }
}
