package ch11_state;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:10:26
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Girl {
	private String name;

	private GirlState girlState = new GirlHapperState();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void smile() {
		girlState.smile();
	}

	public void cry() {
		girlState.cry();
	}
}
