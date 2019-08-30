package ch05_filter.base;

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
    private List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public String doFilter(String msg) {
        for (Filter filter : filters) {
            msg = filter.doFilter(msg);
        }
        return msg;
    }
}
