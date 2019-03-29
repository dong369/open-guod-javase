package ch05_filter.web;

import ch05_filter.base.MsgProcesser;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:19:23
 * @JDK 1.8
 * @Description 功能模块：责任链模式
 */
public class MainTest01 {
    public static void main(String[] args) {
        String msg = "大家好，<java>，敏感的话语，被就业，需要系统进行处理！";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        FilterChain fc = new FilterChain();
        fc.add(new FaceFilter()).add(new HtmlFilter()).add(new SensitiveFilter());
        fc.doFilter(request, response, fc);
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
