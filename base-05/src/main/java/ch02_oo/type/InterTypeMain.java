package ch02_oo.type;

import ch06_proxy.dynamicproxy.Movable;

/**
 * project - 接口注入
 *
 * @author guodd
 * @version 1.0
 */
public class InterTypeMain {
    public static void main(String[] args) {

    }

    static class Person03 implements Person {
        private Movable movable;

        @Override
        public void set(Movable movable) {
            this.movable = movable;
        }

        public void go() throws InterruptedException {
            movable.move();
        }
    }

    interface Person {
        void set(Movable movable);
    }
}


