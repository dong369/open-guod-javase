package ch05_filter.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/6 时间:21:01
 * @JDK 1.8
 * @Description 功能模块：
 */
public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace("被就业", "就业").replace("敏感", "不敏感");
    }
}
