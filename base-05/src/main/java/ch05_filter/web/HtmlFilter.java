package ch05_filter.web;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/6 时间:20:59
 * @JDK 1.8
 * @Description 功能模块：
 */
public class HtmlFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace(">", ")");
        chain.doFilter(request, response, chain);
    }
}
