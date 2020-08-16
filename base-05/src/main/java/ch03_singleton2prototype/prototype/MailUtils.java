package ch03_singleton2prototype.prototype;

import java.text.MessageFormat;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class MailUtils {
    public static void sendMail(Mail mail) {
        String content = "向{0}同学，邮件地址{1}，邮件内容{2}";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getEmailAdd(), mail.getContent()));
    }

    public static void saveMail(Mail mail) {
        System.out.println("原模板：" + mail.getName() + mail.getEmailAdd() + mail.getContent());
    }
}
