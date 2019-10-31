public class Logicmeans {
static // продемонстрировать применение значений типа boolean
	class Booltest {
	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b равно " + b);
		b = true;
		System.out.println("b равно " + b);
		
		// значения типа boolean может управлять оператором if
		if(b) System.out.println("Этот код выполняется.");
		b = false;
		if(b) System.out.println("Этот код не выполняется.");
		
		// результат сравнения - значения типа boolean
		System.out.println("10 > 9 равно " + (10 > 9));
	}
}
}
