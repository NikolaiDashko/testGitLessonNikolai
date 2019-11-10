package HomeWork;
import java.util.Arrays;
import java.util.Scanner;

public class Vozvrat_Maximum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray; 					// переменная для установки массива
		
		System.out.println("Введите число для установки размера массива:");
		sizeOfArray = scanner.nextInt();
				
		int[] array = new int[sizeOfArray]; // массив для хранения чисел
		
		System.out.println("Введите " + sizeOfArray + " числа/чисел:");
		
		for(int i = 0; i < array.length; i++) // заполнение массива числами
		{
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		Integer max = Arrays.stream(array) 	// создание стрима из массива
				.boxed()					// упаковка интов в интеджеры
				.max(Integer::compareTo)	// сравнение элементов на максимум
				.get();						
		
		System.out.println("Максимальное число равно " + max);			// вывод результата на консоль
	}
}