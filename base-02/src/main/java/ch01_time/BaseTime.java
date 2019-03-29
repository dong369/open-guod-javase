package ch01_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/20 时间:13:04
 * @JDK 1.8
 * @Description 功能模块：
 */
public class BaseTime {
    public static void main(String[] args) throws ParseException {
        // 今天
        System.out.println(System.currentTimeMillis());
        System.out.println("今天：" + new Date());
        System.out.println("今天：" + new java.sql.Date(System.currentTimeMillis()));
        System.out.println("今天：" + Calendar.getInstance().getTimeInMillis());
        System.out.println("今天：" + Clock.systemDefaultZone().millis());
        Clock clock = Clock.systemUTC();
        System.out.println("今天：" + clock.instant());
        System.out.println("今天：" + clock.millis());

        // 昨天
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, -1);
        System.out.println("昨天：" + instance.getTime());
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.minusDays(1);
        System.out.println("昨天：" + localDateTime);

        // 格式化时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("格式化时间：" + simpleDateFormat.format(System.currentTimeMillis()));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("格式化时间：" + dateTimeFormatter.format(LocalDateTime.now()));

        // 格式化
        long nowTime = System.currentTimeMillis();// 取得当前系统时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
        String date01 = sdf.format(new Date(nowTime));
        String date02 = sdf.format(nowTime);
        String date03 = sdf.format(System.currentTimeMillis());
        System.out.println(date01);
        System.out.println(date02);
        System.out.println(date03);

        // 时间先后顺序
        LocalDateTime of01 = LocalDateTime.of(2018, 12, 27, 13, 01, 55);
        LocalDateTime of02 = LocalDateTime.of(2018, 12, 27, 13, 01, 59);
        System.out.println(of01.isEqual(of02));
        System.out.println(of01.isBefore(of02));
        System.out.println(of01.isAfter(of02));

        // Date - LocalDateTime
        LocalDateTime dateToLocalDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        System.out.println(dateToLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
        System.out.println(dateToLocalDateTime);

        // LocalDateTime - Date
        Date from = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(from);

        // Date - String
        Date date = new Date();
        SimpleDateFormat simpleDateFormatDateToStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormatDateToStr.format(date);
        System.out.println(format);

        // String - Date
        String stringDate = "2016-10-24 21:59:06";
        SimpleDateFormat strDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = strDate.parse(stringDate);
        DateTimeFormatter df01 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse("2018-01-12 17:07:05", df01);
        System.out.println(ldt);
        System.out.println(parse);
        DateTimeFormatter df02 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");

        //获取秒数
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        //获取毫秒数
        Long milliSecond01 = LocalDateTime.of(2019, 01, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        Long milliSecond02 = LocalDateTime.of(2019, 01, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        Long milliSecond03 = LocalDateTime.of(2019, 01, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();

        System.out.println(System.currentTimeMillis());
        System.out.println(milliSecond01.equals(milliSecond02 + 60));
        System.out.println(milliSecond01 + 60);
    }
}
