package ch18_command;

import java.util.ArrayList;
import java.util.List;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:10:26
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Boy {
	private String name;

	private List<Command> commands = new ArrayList<Command>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCommand(Command c1) {
		this.commands.add(c1);
	}

	public void doSomeThing(Command command) {

	}

	public void executeCommands() {
		for (Command c : commands) {
			c.execute();
		}
	}
}
