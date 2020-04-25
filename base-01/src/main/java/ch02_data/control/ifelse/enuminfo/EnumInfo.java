package ch02_data.control.ifelse.enuminfo;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public enum EnumInfo {
    aa {
        @Override
        public void apply() {
            System.out.println("aa");
        }
    }, bb {
        @Override
        public void apply() {
            System.out.println("bb");
        }
    }, cc {
        @Override
        public void apply() {
            System.out.println("cc");
        }
    };

    public abstract void apply();
}
