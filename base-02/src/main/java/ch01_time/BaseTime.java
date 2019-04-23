package ch01_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
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
        System.out.println("new Date()今天：" + new Date());
        System.out.println("new java.sql.Date今天：" + new java.sql.Date(System.currentTimeMillis()));
        System.out.println("Calendar今天：" + Calendar.getInstance().getTimeInMillis());
        System.out.println("Clock今天：" + Clock.systemDefaultZone().millis());
        Clock clock = Clock.systemUTC();
        System.out.println("Clock今天：" + clock.instant());
        System.out.println("Clock今天：" + clock.millis());

        // 昨天
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, -1);
        System.out.println("Calendar昨天：" + instance.getTime());
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.minusDays(1);
        System.out.println("LocalDateTime昨天：" + localDateTime);

        // 格式化时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("SimpleDateFormat格式化时间：" + simpleDateFormat.format(System.currentTimeMillis()));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("DateTimeFormatter格式化时间：" + dateTimeFormatter.format(LocalDateTime.now()));

        // 格式化
        long nowTime = System.currentTimeMillis();// 取得当前系统时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
        String date01 = sdf.format(new Date(nowTime));
        String date02 = sdf.format(nowTime);
        String date03 = sdf.format(System.currentTimeMillis());
        System.out.println("格式化：" + date01);
        System.out.println("格式化：" + date02);
        System.out.println("格式化：" + date03);

        // 时间先后顺序
        LocalDateTime of01 = LocalDateTime.of(2018, 12, 27, 13, 1, 55);
        LocalDateTime of02 = LocalDateTime.of(2018, 12, 27, 13, 1, 59);
        System.out.println("时间先后顺序：" + of01.isEqual(of02));
        System.out.println("时间先后顺序：" + of01.isBefore(of02));
        System.out.println("时间先后顺序：" + of01.isAfter(of02));

        // Date - LocalDateTime
        LocalDateTime dateToLocalDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        System.out.println(dateToLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
        System.out.println("Date - LocalDateTime：" + dateToLocalDateTime);

        // LocalDateTime - Date
        Date from = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("LocalDateTime - Date：" + from);

        // LocalDateTime - Long
        ZoneId zone01 = ZoneId.systemDefault();
        Instant instant01 = localDateTime.atZone(zone01).toInstant();
        long l = instant01.toEpochMilli();

        // Long - LocalDateTime
        Instant instant02 = Instant.ofEpochMilli(l);
        ZoneId zone02 = ZoneId.systemDefault();
        LocalDateTime localDateTimeLong = LocalDateTime.ofInstant(instant02, zone02);
        System.out.println(localDateTimeLong);

        // Date - String
        Date date = new Date();
        SimpleDateFormat simpleDateFormatDateToStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormatDateToStr.format(date);
        System.out.println("Date - String：" + format);

        // String - Date
        String stringDate = "2016-10-24 21:59:06";
        SimpleDateFormat strDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = strDate.parse(stringDate);
        DateTimeFormatter df01 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter df02 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
        LocalDateTime ldt = LocalDateTime.parse("2018-01-12 17:07:05", df01);
        System.out.println("String - LocalDateTime：" + ldt);
        System.out.println("String - Date：" + parse);

        //获取秒数
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        Long milliSecond01 = LocalDateTime.of(2019, 1, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long milliSecond02 = LocalDateTime.of(2019, 1, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        Long milliSecond03 = LocalDateTime.of(2019, 1, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(second);
        System.out.println(System.currentTimeMillis());
        System.out.println(milliSecond01.equals(milliSecond02 + 60));
        System.out.println(milliSecond01 + 60);
        System.out.println(milliSecond03);
    }
}
