package ch04_exception.log.jul;

import org.junit.Test;

import java.util.logging.Logger;

/**
 * The class/interface
 * JUL是Java的until包下的，可以直接记录日志，JDK14Logger，打印的日志是红色的
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class JulMain {
    private final Logger logger = Logger.getLogger("JulMain");

    @Test
    public void jul() {
        logger.info("ch04_exception.log info");
        logger.warning("ch04_exception.log warning");
    }
}
