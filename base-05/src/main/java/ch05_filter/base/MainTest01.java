package ch05_filter.base;

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
        String s = "大家好，<java>，敏感的话语，被就业，需要系统进行处理！";
        MsgProcesser msgProcesser = new MsgProcesser();
        msgProcesser.setMsg(s);
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter()).add(new FaceFilter());
        msgProcesser.setFc(filterChain);
        String process = msgProcesser.process();
        System.out.println(process);
    }
}
