package ch01_design_principles.demeter.v2;

/**
 * Law of Demeter，迪米特法则，简称LoD
 * 外观模式 | 中介者模式
 *
 * @author guodd
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boos boos = new Boos();
        boos.commandCheckNumber(new TeamLeader());
    }
}
