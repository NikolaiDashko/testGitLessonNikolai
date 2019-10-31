package HomeWork;
import java.util.Scanner;

public class Oboi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;//число столбцов
		System.out.println("Введите длинну строки для обоев");
		a = sc.nextInt();
		for (int k = 0; k < 7; k++) { // 7 это длинна "рулона" обоев
			for (int i = 0; i < a; i++) {
				if (i % 2 != 0) {
					System.out.print("+++");
				}
				else {
					System.out.print("***");
				}
			}
			System.out.println();
			System.out.println("Some new changes");
		}

		sc.close();
	}

}