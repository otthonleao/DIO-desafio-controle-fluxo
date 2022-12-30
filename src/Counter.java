/**
 * <h1>Counter</h1>
 * @author	Otthon Leao
 * @version	1.0
 * @since	28/12/2022
 */

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
		boolean restart = true;

		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Type the first number:");
				int number1 = scan.nextInt();
				System.out.println("Type the second number:");
				int number2 = scan.nextInt();
				scan.close();

				count(number1, number2);
				restart = false;

			} catch (InputMismatchException e) {
				headerTerminal(false);
				System.out.println("INVALID FORMART!!!\nInsert a integer number\n");
			} catch (IllegalArgumentException e) {
				headerTerminal(false);
				System.out.println("The first number need to be smaller than second number\n");
			} catch (NoSuchElementException e) {
				headerTerminal(false);
				System.out.println("The first number need to be smaller than second number\n");
			}
		} while (restart);
    }

	static void count(int number1, int number2) throws IllegalArgumentException {
		if(number1 < number2) {
			headerTerminal(true);
			for(int count = 1; number1 <= number2; count++) {
				System.out.println("imprimindo o número " + count + ": " + number1);
				number1++;
			}
		} else {
			headerTerminal(false);
			throw new IllegalArgumentException();
		}
	}

	static void headerTerminal(boolean headerType) {
		if (headerType == false) {
			System.out.println("\n================ ERROR ===============");
		} else {
			System.out.println("\n=========================");
			System.out.println("=     START COUNTER     =");
			System.out.println("=========================");
		}
	}
}
