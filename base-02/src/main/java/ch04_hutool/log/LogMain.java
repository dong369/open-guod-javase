package ch04_hutool.log;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/28 时间:8:33
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LogMain {
    public static void main(String[] args) {
        Log log = LogFactory.get();
        log.info("[{}]", "日志测试");
    }
}
