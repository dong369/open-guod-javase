package ch03_singleton2prototype.prototype;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class MainTest {
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setContent("初始化..");
        for (int i = 0; i < 10; i++) {
            mail.setName("姓名" + i);
            mail.setEmailAdd("地址" + i);
            mail.setContent("内容" + i);
            MailUtils.sendMail(mail);
        }
    }
}
