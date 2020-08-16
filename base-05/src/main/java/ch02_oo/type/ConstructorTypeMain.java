package ch02_oo.type;

import ch02_oo.type.inter.Movable;

/**
 * project - 构造函数注入
 *
 * @author guodd
 * @version 1.0
 */
public class ConstructorTypeMain {
    public static void main(String[] args) {
    }

    static class Person01 {
        Movable movable;

        public Person01(Movable movable) {
            this.movable = movable;
        }

        public void go() {
            movable.move();
        }
    }
}