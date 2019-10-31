public class Dynamicinitialization {
  // В этом примере демонстрируется динамическая инициализация
	static class DynInit {
		public static void main(String[] args) {
	double a = 6.0, b = 8.0;
	
	// динамическая инициализация переменной c
	double c = Math.sqrt(a * a + b * b);
	System.out.println("Гипотенуза равна " + c);
		}
	}
}
