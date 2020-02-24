package ch07_filter.web;

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
    public void doFilter(Request request, Response response,FilterChain chain) {
        request.requestStr = request.requestStr.replace("被就业", "就业").replace("敏感", "不敏感");
        chain.doFilter(request, response, chain);
    }
}
