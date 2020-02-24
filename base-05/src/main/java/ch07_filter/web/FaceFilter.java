package ch07_filter.web;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/6 时间:21:11
 * @JDK 1.8
 * @Description 功能模块：
 */
public class FaceFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace("java", "^v^");
        chain.doFilter(request, response, chain);
    }
}
