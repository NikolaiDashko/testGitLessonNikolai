package HomeWork;

import java.util.Scanner;

public class Figure {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число для максимальнной высоты фигуры: ");

		int height = sc.nextInt();
		int count = 1;

		for (int i = 1; i <= height * 2;) {

			if (count <= i && i <= height * 2 - count) {

				System.out.print("*");
				count += 1;
			} else {

				System.out.println();
				i += 1;
				count = 1;
			}
		sc.close();
	}
		}
	}
