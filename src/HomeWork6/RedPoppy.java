package HomeWork6;

public class RedPoppy extends Candy {
	public RedPoppy(String name, int amount, double weight, int sugar, int callories) {
		super(name, amount, weight, sugar, callories);
	}

	@Override
	public String toString() {
		return "Червоний мак [name=" + name + ", amount=" + amount + ", weight=" + weight + ", sugar=" + sugar + ", callories=" + callories + "]";
	}

}