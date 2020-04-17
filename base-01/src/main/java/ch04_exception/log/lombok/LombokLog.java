package ch04_exception.log.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Slf4j
public class LombokLog {
    @Test
    public void lombokLog() {
        log.info("lombok ch04_exception.log info");
    }
}
