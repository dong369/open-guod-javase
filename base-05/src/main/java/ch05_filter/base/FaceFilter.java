package ch05_filter.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/6 时间:21:11
 * @JDK 1.8
 * @Description 功能模块：过滤
 */
public class FaceFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace(":)","^v^");
    }
}
