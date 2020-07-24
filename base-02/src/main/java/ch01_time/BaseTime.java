package ch01_time;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseTime {
    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        time.add(Calendar.DATE, -1);
        System.out.println(time.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String time02 = format.format(new Date(time.getTimeInMillis()));
        String time03 = format.format(new Date(System.currentTimeMillis()));
        System.out.println(time03);
    }

    @Test
    public void test() {
        Double aa = 4.0666D;
        long duration = aa.longValue();
        System.out.println(duration);
    }
}
