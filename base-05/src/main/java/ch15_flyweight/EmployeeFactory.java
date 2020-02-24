package ch15_flyweight;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:9:03
 * @JDK 1.8
 * @Description 功能模块：
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getEmployee(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (StringUtils.isEmpty(manager)) {
            manager = new Manager(department);
            System.out.print("创建部门经理" + department);
            String reportContent = department + "部门汇报，汇报的内容。";
            manager.setReportContent(reportContent);
            System.out.println("，创建报告，" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
