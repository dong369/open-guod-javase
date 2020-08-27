package ch08_strategy.base;

/**
 * project -
 *
 * @author guodd
 */
public class Dog implements Comparable {
	private int food;

	public Dog() {
		super();
	}

	public Dog(int food) {
		super();
		this.food = food;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	@Override
	public int compareTo(Object o) {
		Dog d = (Dog) o;
		if (this.food > d.getFood())
			return 1;
		else if (this.food < d.getFood())
			return -1;
		else
			return 0;
	}

}
