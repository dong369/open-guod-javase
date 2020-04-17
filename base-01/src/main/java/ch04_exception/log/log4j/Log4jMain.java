package ch04_exception.log.log4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class/interface
 * LOG4J也可以直接记录日志，Log4JLogger
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Log4jMain {
    private final Logger logger = LoggerFactory.getLogger("Log4jMain");

    @Test
    public void log4j() {
        logger.info("ch04_exception.log lo4j java");
    }
}
