package ch07_thread.thread;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * The class/interface 线程守护，专门为其它线程提供服务，别的线程执行完毕，守护线程也就没有必要。
 * 类比成服务员
 * 若进程中剩余的线程都是守护线程的话，则进程终止！！！
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Slf4j
public class Daemon {
    public static void main(String[] args) {
        Room room1 = new Room(1, 5000);
        Room room2 = new Room(2, 3000);

        Writer writer = new Writer();
        // 守护线程设置
        writer.setDaemon(true);

        writer.start();
        room1.start();
        room2.start();
    }

    @Setter
    @Getter
    @AllArgsConstructor
    static class Room extends Thread {
        /**
         * 属性描述：房间号码
         */
        private Integer no;

        /**
         * 属性描述：房间名称
         */
        private Integer time;

        @Override
        public void run() {
            try {
                log.info(no + "房间开始消费");
                Thread.sleep(time);
                log.info("消费时间" + time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Writer extends Thread {
        @Override
        public void run() {
            for (; ; ) {
                try {
                    Thread.sleep(1000);
                    log.info(String.valueOf(LocalDateTime.now()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}