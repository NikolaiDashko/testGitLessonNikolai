package HomeWork8;

import java.io.*;
import java.util.Scanner;

public class TextEditor {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Для выхода из редактора напишите exit!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Вводите текст.");
		File temp = new File("filename");
		try {
			if (!temp.exists()) {
				temp.createNewFile();
			}	
		} catch (IOException e) {
			System.out.println("ERROR!");
		}
		PrintStream recorder = new PrintStream(temp);
		//модуль ввода текста
		while (true) {
			String text = sc.nextLine();
			if (text.equals("exit")) {
				System.out.println("Вы завершили работу! Желаете сохранить изменения? (yes/no)");
					
				break;
			}
			recorder.printf(text + "\n", temp);
			recorder.println();
		}
		recorder.close();
		String text=sc.nextLine();
					//Модуль сохранения данных
		if (text.equals("yes")) {
			System.out.println("Укажите имя для файла:");
			String final_name = sc.nextLine() + ".txt";
			temp.renameTo(new File(final_name));
			System.out.println("Результат сохранен в файл "+'"'+final_name+'"');
		}
		if (text.equals("no")) {
			System.out.println("Результат не сохранен.");
			}
		sc.close();
	}
}
