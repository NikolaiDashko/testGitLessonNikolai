package HomeWork6;

public class Barberry extends Candy {
		public Barberry(String name, int amount, double weight, int sugar, int callories) {
			super(name, amount, weight, sugar, callories);
		}

		@Override
		public String toString() {
			return "Барбарис [name=" + name + ", amount=" + amount + ", weight=" + weight + ", sugar=" + sugar + ", callories=" + callories + "]";
		}

	}