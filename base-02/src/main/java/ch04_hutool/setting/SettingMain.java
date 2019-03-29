package ch04_hutool.setting;

import cn.hutool.setting.Setting;

/**
 * project -
 *
 * @author yanfa07
 * @version 1.0
 * @date 日期:2019/3/28 时间:8:08
 * @JDK 1.8
 * @Description 功能模块：
 */
public class SettingMain {
    public static void main(String[] args) {
        Setting set = new Setting("file.setting");
        Setting setting = new Setting("file.properties");
        System.out.println(set.get("name"));
        System.out.println(setting.get("name"));
    }
}