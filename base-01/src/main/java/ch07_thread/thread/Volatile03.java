package ch07_thread.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * The class/interface 同步机制，只能修饰变量
 * volatile是Java虚拟机提供的轻量级同步机制
 * 1、保证可见性
 * 2、不保证原子性
 * 3、禁止指令重排
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Slf4j
public class Volatile03 {
    public static void main(String[] args) {
        MyData myData = new MyData();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in " + myData.a);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addOne();
            System.out.println(Thread.currentThread().getName() + "\t update a to " + myData.a);
        }, "A").start();

        while (myData.a == 0) {
            // TODO: 2020/4/18
        }

        System.out.println(Thread.currentThread().getName());
    }
    static class MyData {
        int a = 0;
        void addOne() {
            this.a += 1;
        }
    }
}

