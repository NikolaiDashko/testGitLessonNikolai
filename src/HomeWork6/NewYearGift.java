package HomeWork6;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class NewYearGift implements SelectionOfParameters {
	public List<Candy> gifts = new ArrayList<Candy>();
	public NewYearGift() {
	}
	public void add(Candy candy) {
		gifts.add(candy);
	}
	public int calloriesNewYearGift() {
		int callories = 0;
		for (Candy candy : gifts) {
			callories += (candy.getCallories() * candy.getAmount());
		}
		return callories;
	}
	public double weightNewYearGift() {
		double weight = 0;
		for (Candy candy : gifts) {
			weight += (candy.getWeight() * candy.getAmount());
		}
		return weight;
	}
	public String sugarRange(int minSugar, int maxSugar) {
		String str = "";
		for (Candy candy : gifts) {
			if (candy.getSugar() >= minSugar && candy.getSugar() <= maxSugar) {
				str = str.concat(candy.toString() + "\n");
			}
		}
		if (!str.isEmpty()) {
			return str;
		} else {
			return "Нічим не можемо вам допомогти";
		}
	}
	public int sugarNewYearGift() {
		int sugar = 0;
		for (Candy candy : gifts) {
			sugar += (candy.getSugar() * candy.getAmount());
		}
		return sugar;
	}
	@Override
	public String toString() {
		String str = "";
		for (Candy candy : gifts) {
			str = str.concat(candy.toString() + "\n");
		}
		return str;
	}
	@Override
	public void sortCallories() {
		Collections.sort(gifts, (candy1, candy2) -> (int) (candy1).getCallories() - (int) candy2.getCallories());
	}
	@Override
	public void sortSugar() {
		Collections.sort(gifts, (candy1, candy2) -> (int) candy1.getSugar() - (int) candy2.getSugar());
	}
	@Override
	public void sortWeight() {
		Collections.sort(gifts, (candy1, candy2) -> (int) candy1.getWeight() - (int) candy2.getWeight());
	}
	@Override
	public void sortAmount() {
		Collections.sort(gifts, (candy1, candy2) -> candy1.getAmount() - candy2.getAmount());
	}
}