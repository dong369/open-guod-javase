package ch10_command;

/**
 * project -
 *
 * @author Administrator
 * @date 日期:2019年1月12日 时间:下午7:59:12
 * @JDK 1.8
 * @version 1.0
 * @Description 功能模块： 去购物命令
 */
public class ShoppingCommand extends Command {

	@Override
	public void execute() {
		System.out.println("购物");
	}

	@Override
	public void unDo() {
		System.out.println("撤回");
	}

}
