package ch01_design_principles.demeter.v1;

/**
 * Law of Demeter，迪米特法则，又叫最少知识原则，简称LoD
 * 符合迪米特法则的“某人”、“朋友”和“陌生人”
 * 只与你直接的朋友们通信
 * 不要跟“陌生人”说话
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
