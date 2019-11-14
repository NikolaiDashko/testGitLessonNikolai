package HomeWork;

import java.util.Scanner;

public class Pryamougolnik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ширину");
		int a = sc.nextInt();
		System.out.println("Введите высоту-");
		int b = sc.nextInt();
		sc.close();
		System.out.println(met(a,b));
	}
	static String met(int a, int b){
		String lin = "";
		String line = "";
		for(int i = 0; i < a; i++){
			lin += "+";
		}
		
		for( int i = 0; i < b; i++){
		line = line + "\n" + lin;	
		}
		return line;
	}

}