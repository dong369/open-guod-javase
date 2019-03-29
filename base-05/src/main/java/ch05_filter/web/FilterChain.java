package ch05_filter.web;

import java.util.ArrayList;
import java.util.List;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/6 时间:21:16
 * @JDK 1.8
 * @Description 功能模块：过滤器链
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public FilterChain add(Filter filter) {
        this.filters.add(filter);
        return this;
    }


    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) return;
        Filter f = filters.get(index);
        index++;
        f.doFilter(request, response, chain);
    }
}
