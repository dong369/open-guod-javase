package ch03_oothinking.equals2hashcode;

public class UseHashEquals {
    @Override
    public boolean equals(Object o) {
        System.out.println(o instanceof UseHashEquals);
        System.out.println(o.getClass() == getClass());
        System.out.println(getClass());
        System.out.println(o.getClass());
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return 1;
    }

    public static void main(String[] args) {
        UseHashEquals hashEquals = new UseHashEquals();
        System.out.println(hashEquals.equals(new UseHashEquals()));
    }
}