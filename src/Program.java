import java.util.Scanner;

public class Program {

   public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
           
      System.out.println("Введите любое, приходящее на ум число, "
      		+ "и после нажатия \nклавиши Enter все цифры в числе запишутся в столбик: ");
     
      int num = sc.nextInt();
      String text = Integer.toString(num);
      int i = 0;
      int length = Integer.toString(num).length();
     
      while(i < length){
         char result = text.charAt(i++);
         System.out.println(result);   
      }
      sc.close();
   }
}
		
 
