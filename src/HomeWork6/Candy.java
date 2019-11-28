package HomeWork6;
public class Candy {
	public String name;
	public int amount;
	public double weight;
	public int sugar;
	public int callories;// в 1 г углеводов содержится 4 ккал !!!
	
	public Candy() {
	}

	public Candy(String name, int amount, double weight, int sugar, int callories) {
		this.name = name;
		this.amount = amount;
		this.weight = weight;
		this.sugar = sugar;
		this.callories = sugar * 4; // в 1 г углеводов содержится 4 ккал !!!
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public double getWeight() {
		return weight;
	}

	public int getSugar() {
		return sugar;
	}
	public int getCallories() {
		return callories;
	}
}