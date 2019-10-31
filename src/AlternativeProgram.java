public class AlternativeProgram {
    
    public static void main(String[] args) {
       
        System.out.print("Input name: ");
        String name = System.console().readLine();
        System.out.print("Input age: ");
        int age = Integer.parseInt(System.console().readLine());
        System.out.print("Input height: ");
        float height = Float.parseFloat(System.console().readLine());
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
    }
}
