import java.util.Scanner;
public class Program1 {

	   public static void main(String[] args) {
	     
	      Scanner sc = new Scanner(System.in);
    System.out.println("Вычислим площадь треугольника.");
    System.out.println("Введите первую сторону треугольника : ");
    double a = sc.nextDouble();
    System.out.println("Введите вторую сторону треугольника : ");
    double b = sc.nextDouble();
    System.out.println("Введите третью сторону треугольника : ");
    double c = sc.nextDouble();
    double p = (a + b + c)/2;
    System.out.println("Площадь треугольника равна : " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    sc.close();
}
}
