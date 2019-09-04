package ch35_filter.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:19:23
 * @JDK 1.8
 * @Description 功能模块：责任链模式
 */
public class MainTest {
    public static void main(String[] args) {
        String s = "大家好，<:)>，敏感的话语，被就业，需要系统进行处理！";
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(s);
        FilterChain filterChain01 = new FilterChain();
        filterChain01.add(new HtmlFilter()).add(new FaceFilter());
        FilterChain filterChain02 = new FilterChain();
        filterChain02.add(new SensitiveFilter());
        filterChain01.add(filterChain02);
        mp.setFc(filterChain01);
        String process = mp.process();
        System.out.println(process);
    }
}
