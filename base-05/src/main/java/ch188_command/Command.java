package ch188_command;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:11:33
 * @JDK 1.8
 * @Description 功能模块：
 */
public abstract class Command {
	/**
	 * @Title execute
	 * @date 日期:2019年1月12日 时间:下午8:01:21
	 * @return void
	 * @Description 功能：执行
	 */
	public abstract void execute();

	/**
	 * @Title unDo
	 * @date 日期:2019年1月12日 时间:下午8:01:30
	 * @return void
	 * @Description 功能：撤回
	 */
	public abstract void unDo();
}
