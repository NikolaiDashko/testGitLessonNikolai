package HomeWork;
import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j + 1;
			}
		}

		System.out.println("Начальная версия: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		
		int roll = 1;//на сколько градусов повернуть (от 0 до 4), где 0 - не поворачивать, а 4 - поворот на 360 градусов
		int tmp;
		
		for (int k = 0; k < roll; k++) {
			for (int i = 0; i < arr.length / 2; i++) {
				for (int j = 0; j < arr.length / 2 + arr.length % 2; j++) {
					tmp = arr[i][j];
					arr[i][j] = arr[arr.length - 1 - j][i];
					arr[arr.length - 1 - j][i] = arr[arr.length - 1 - i][arr.length
							- 1 - j];
					arr[arr.length - 1 - i][arr.length - 1 - j] = arr[j][arr.length
							- 1 - i];
					arr[j][arr.length - 1 - i] = tmp;
				}

			}
		}
		System.out.println("Отформатированная: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}