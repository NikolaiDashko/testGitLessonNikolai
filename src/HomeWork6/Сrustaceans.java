package HomeWork6;

public class Сrustaceans extends Candy {
	public Сrustaceans(String name, int amount, double weight, int sugar, int callories) {
		super(name, amount, weight, sugar, callories);
	}

	@Override
	public String toString() {
		return "Рачки [name=" + name + ", amount=" + amount + ", weight=" + weight + ", sugar=" + sugar + ", callories=" + callories + "]";
	}

}