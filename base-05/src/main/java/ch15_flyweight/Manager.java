package ch15_flyweight;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:9:02
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Manager implements Employee {
    /**
     * 属性描述：部分
     */
    private String department;

    /**
     * 属性描述：内容
     */

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
