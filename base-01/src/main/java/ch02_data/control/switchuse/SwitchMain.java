package ch02_data.control.switchuse;

/**
 * The class/interface switch(expr)
 * Java 5只能是byte、short、char、int类型
 * Java 5-Java 7引入了enum类型
 * Java 7之后引入了String类型
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class SwitchMain {
    public static void main(String[] args) {
        // char（Character）, byte（Byte）, short（Short）, int（Integer）, String, or an enum
        switch ("AA") {
            case "AA":
                System.out.println("AA");
                break;
            default:
                System.out.println("ss");
        }
        System.out.println("");
    }
}
