package ch03_oothinking.interfacetype;

/**
 * @author guodd
 * @version 1.0
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
