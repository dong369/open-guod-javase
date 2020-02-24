package ch07_filter.web;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/6 时间:20:54
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface Filter {
    void doFilter(Request request, Response response,FilterChain chain);
}
