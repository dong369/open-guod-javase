package ch17_java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:15:33
 * @JDK 1.8
 * @Description 功能模块：
 */
public class NashornTestMain01 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine javaScriptEngine = manager.getEngineByName("JavaScript");
        System.out.println(javaScriptEngine.getClass().getName());
        Object eval = javaScriptEngine.eval("function fun(){" +
                "return 10}; fun()*24;");
        System.out.println(eval);
    }
}
