package HomeWork;

import java.util.Arrays;

public class MassivElementov {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		int[] arrResult = Arrays.copyOf(arr, arr.length * 2);
		for (int i = arr.length; i < arrResult.length; i += 1) {
			arrResult[i] = arrResult[i - arr.length] * 2;
		}
		
		System.out.println("Исходный мaссив: " + Arrays.toString(arr));
		System.out.println("Удвоенный массив: " + Arrays.toString(arrResult));
	}

}