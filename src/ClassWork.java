import java.util.Arrays;
public class ClassWork {

	public static void main(String[] args) {
		  Integer[] arr = {100, 10, 189, 1, 66};
		  String[] strArr = {"asdad", "a", "asdasd", "as"};
			Arrays.sort(strArr, (str1, str2) -> str2.length() - str1.length());
			System.out.println(Arrays.toString(strArr)); // "asdasd", "asdad", "as", "a"  
	}

}
