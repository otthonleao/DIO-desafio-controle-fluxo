import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the first number:");
		int number1 = scan.nextInt();
		System.out.println("Type the second number:");
		int number2 = scan.nextInt();
		
		System.out.println("\n===================");
		System.out.println("=  START COUNTER  =");
		System.out.println("===================");

		for(int count = number1; count <= number2; count++) {
			System.out.println(count);
		}
    }
}
