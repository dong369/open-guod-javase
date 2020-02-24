package ch01_design_principles.demeter.v1;

/**
 * project - 迪米特法则
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:21:45
 * @JDK 1.8
 * @Description 功能模块：Law of Demeter，迪米特法则
 */
public class MainTest {
    public static void main(String[] args) {
        Boos boos = new Boos();
        boos.commandCheckNumber(new TeamLeader());
    }
}
