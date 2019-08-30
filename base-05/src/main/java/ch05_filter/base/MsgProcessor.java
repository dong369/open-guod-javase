package ch05_filter.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/6 时间:20:52
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MsgProcessor {
    private String msg;
    // private Filter[] filters = new Filter[]{new HtmlFilter(), new SensitiveFilter(), new FaceFilter()};
    FilterChain fc;

    public FilterChain getFc() {
        return fc;
    }

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        /*for (Filter filter : filters) {
            msg = filter.doFilter(msg);
        }*/
        return fc.doFilter(msg);
    }
}
