package ch01_design_principles.demeter.v1;

/**
 * Law of Demeter，迪米特法则
 *
 * @author guodd
 * @version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Boos boos = new Boos();
        boos.commandCheckNumber(new TeamLeader());
    }
}
