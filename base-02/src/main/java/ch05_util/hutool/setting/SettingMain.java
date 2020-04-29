package ch05_util.hutool.setting;

import cn.hutool.setting.Setting;

/**
 * @author guodd
 * @version 1.0
 */
public class SettingMain {
    public static void main(String[] args) {
        Setting set = new Setting("file.setting");
        Setting setting = new Setting("file.properties");
        System.out.println(set.get("name"));
        System.out.println(setting.get("name"));
    }
}