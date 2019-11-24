package HomeWork6;

public class Main {
		public static void main(String[] args) {
			NewYearGift gift = new NewYearGift();
    
			RedPoppy one = new RedPoppy("Червоний мак", 10, 20, 8, 32);
			Сrustaceans two = new Сrustaceans("Рачки", 14, 8, 6, 24);
			Barberry three = new Barberry("Барбарис", 12, 5, 9, 36);

			gift.add(one);
			gift.add(two);
			gift.add(three);
			
			System.out.println(gift.toString());
			System.out.println("Вага подарунку: " + gift.weightNewYearGift());
			System.out.println("Абсолютна масса цукру на подарунок: " + gift.sugarNewYearGift()+"\n");
			
		// Подсчет каллорий и предупреждение о развитии диабета	
			System.out.println("Калорійність подарунку " + gift.calloriesNewYearGift()+ " ккал");
			if (gift.calloriesNewYearGift() >= 1000) {
				System.out.println("Високий ризик виникнення діабету! Зменшіть кількість цукру в подарунку!" + "\n");
				System.out.println(gift.toString() + "\n");
				}
			
			System.out.println(gift.toString() + "\n");
			System.out.println("Цукерки з цукром  1 до 10 \n" + gift.sugarRange(1, 10)+ "\n");
			System.out.println("Сортування цукерок за вмістом цукру:");
			gift.sortSugar();
			
			System.out.println(gift.toString() + "\n");
			System.out.println("Сортування цукерок за вагою:");
			gift.sortWeight();
			
			System.out.println(gift.toString() + "\n");
			System.out.println("Сортування цукерок за кількістю у пакунку:");
			gift.sortAmount();
			System.out.println(gift.toString() + "\n");
		}
	}
// обьявить переменной лист
// в контейнер или в лист