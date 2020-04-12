package log.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * The class/interface
 * JCL是通过log4j去记录的日志
 * 循环classesToDiscover数组包含下面四个有有顺序的Logger
 * {@link org.apache.commons.logging.impl.Log4JLogger}
 * {@link org.apache.commons.logging.impl.Jdk14Logger}
 * {@link org.apache.commons.logging.impl.Jdk13LumberjackLogger}
 * {@link org.apache.commons.logging.impl.SimpleLog}
 * <p>
 * 好处：
 * 坏处：扩展性差
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class JclMain {
    private final Log log = LogFactory.getLog("JclMain");

    @Test
    public void jcl() {
        log.info("log jcl info");
    }
}
