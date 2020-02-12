package ch03_oothinking.interfacetype;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
public class SameInterface {
    public static void main(String[] args) {
        Man man = new Man();
        man.help();
    }

    interface Filial {
        default void help() {
            System.out.println("老妈，我来救你...");
        }
    }

    interface Love {
        default void help() {
            System.out.println("老婆，我来救你...");
        }
    }

    static class Man implements Filial, Love {
        @Override
        public void help() {
            Filial.super.help();
            Love.super.help();
        }
    }
}
