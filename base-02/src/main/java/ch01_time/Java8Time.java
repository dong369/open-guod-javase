package ch01_time;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
public class Java8Time {
    @Test
    public void getTime() {
        // java.time.LocalDateTime类表示ISO-8601日历系统中没有时区的日期时间，例如2020-01-17T17:11:00.476。
        System.out.println(LocalDateTime.now());
        // java.time.LocalDate类表示ISO-8601日历系统中没有时区的日期，例如:2020-01-17。
        System.out.println(LocalDate.now());
        // java.time.LocalTime类表示ISO-8601日历系统中没有时区的时间，例如17:11:00.477。
        System.out.println(LocalTime.now());
        // java.time.MonthDay类表示ISO-8601日历系统中的月和日，例如--01-17。
        System.out.println(MonthDay.now());
        // java.time.OffsetDateTime类表示ISO-8601日历系统中与UTC/Greenwich的偏移量的日期时间，例如2020-01-17T17:12:49.040+08:00。
        System.out.println(OffsetDateTime.now());
        System.out.println(Year.now());
        System.out.println(YearMonth.now());
    }

    // 今天
    @Test
    public void getNowadays() {
        System.out.println(System.currentTimeMillis());
        System.out.println("new Date()今天：" + new Date());
        System.out.println("new java.sql.Date今天：" + new java.sql.Date(System.currentTimeMillis()));
        System.out.println(Calendar.getInstance().getTime());
        System.out.println("Calendar今天：" + Calendar.getInstance().getTimeInMillis());
        System.out.println("Clock今天：" + Clock.systemDefaultZone().millis());
        // java.time.Clock类使用时区提供对当前即时，日期和时间的访问。
        Clock clock = Clock.systemUTC();
        System.out.println("Clock今天：" + clock.instant());
        System.out.println("Clock今天：" + clock.millis());
        System.out.println(new java.sql.Date(clock.millis()));
    }

    //获取秒数
    @Test
    public void getSecond() {
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        Long milliSecond01 = LocalDateTime.of(2019, 1, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long milliSecond02 = LocalDateTime.of(2019, 1, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        Long milliSecond03 = LocalDateTime.of(2019, 1, 17, 16, 16, 50).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(second);
        System.out.println(System.currentTimeMillis());
        System.out.println(milliSecond01.equals(milliSecond02 + 60));
        System.out.println(milliSecond01 + 60);
        System.out.println(milliSecond03);
        Instant now = Instant.now();
        System.out.println(Instant.now());
        System.out.println(now.toEpochMilli()); // 毫秒
        System.out.println(now.getEpochSecond()); // 秒
    }

    // 获取当前天区间
    @Test
    public void getDay() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String start = dateTimeFormatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.MIN));
        String end = dateTimeFormatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.MAX));
        System.out.println(start + "=>" + end);
    }

    // 前一天（年月日周）
    @Test
    public void getBeforeDays() {
        String oldDay = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now().plusDays(-1));
        System.out.println(oldDay);
    }

    // 后一天（年月日周）
    @Test
    public void getAfterDays() {
        String afterDay = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now().plusDays(1));
        System.out.println(afterDay);
        // java.time.Instant类在时间线上模拟单个瞬时点。
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(instance.getTime()));
    }

    // 格式化时间格式
    @Test
    public void getFormat() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
        System.out.println(sdf.format(new Date()));
        System.out.println(simpleDateFormat.format(new Date()));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
    }

    // 时间先后顺序
    @Test
    public void getOrder() {
        LocalDateTime of01 = LocalDateTime.of(2018, 12, 27, 13, 1, 55);
        LocalDateTime of02 = LocalDateTime.of(2018, 12, 27, 13, 1, 59);
        System.out.println("时间相等：" + of01.isEqual(of02));
        System.out.println("时间前：" + of01.isBefore(of02));
        System.out.println("时间后：" + of01.isAfter(of02));
    }

    // 计算年龄
    @Test
    public void getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.from(DateTimeFormatter.ofPattern("yyyy-MM-dd").parse("1994-02-08"));
        long between = ChronoUnit.YEARS.between(birthday, today);
        System.out.println("你的年龄：" + between);
    }


    // 时间之间转换
    @Test
    public void getDate2LocalDateTime() throws ParseException {
        // Date - LocalDateTime
        Instant dateInstant = new Date().toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(dateInstant, ZoneId.systemDefault());
        System.out.println("Date - LocalDateTime：" + localDateTime);
        // LocalDateTime - Date
        Date from = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("LocalDateTime - Date：" + from);
        // LocalDateTime - Long
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        long longTime = instant.toEpochMilli();
        System.out.println("LocalDateTime - Date：" + longTime);
        // Long - LocalDateTime
        Instant instant1 = Instant.ofEpochMilli(longTime);
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        System.out.println("LocalDateTime - Date：" + localDateTime1);
        // String - Date
        String strDate = "2019-01-01 01:12:12";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse(strDate);
        DateTimeFormatter df01 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse("2018-01-12 17:07:05", df01);
        System.out.println("String - LocalDateTime：" + ldt);
        System.out.println("String - Date：" + parse);
        // Date - String
        Date date = new Date();
        SimpleDateFormat simpleDateFormatDateToStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatStr = simpleDateFormatDateToStr.format(date);
        System.out.println("Date - String：" + formatStr);
        // Date - zonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        System.out.println(zonedDateTime.getDayOfWeek());
        System.out.println(zonedDateTime.getDayOfWeek().getValue());
    }

    // 时区 @{link {@link ZonedDateTime}}
    @Test
    public void zonedDateTime() {
        // America/New_York  & Asia/Shanghai
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getDayOfWeek().getValue());
        System.out.println(System.currentTimeMillis());
        System.out.println(Clock.systemUTC().instant());
        System.out.println(Clock.systemUTC().millis());
        System.out.println(LocalDateTime.now());
    }
}