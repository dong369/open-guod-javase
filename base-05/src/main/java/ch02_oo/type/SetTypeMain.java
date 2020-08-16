package ch02_oo.type;

import ch06_proxy.dynamicproxy.Movable;

/**
 * project - setter 方式注入
 *
 * @author guodd
 * @version 1.0
 */
public class SetTypeMain {
    public static void main(String[] args) {
    }

    static class Person02 {
        private Movable movable;

        public Movable getMovable() {
            return movable;
        }

        public void setMovable(Movable movable) {
            this.movable = movable;
        }

        public void go() throws InterruptedException {
            movable.move();
        }
    }
}
