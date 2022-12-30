/**
 * <h1>Counter</h1>
 * @author	Otthon Leao
 * @version	1.0
 * @since	28/12/2022
 */

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Counter {
    public static void main(String[] args) {
		boolean restart = true;
		boolean headerType = true;

		do {
			try {
				//Iniciando o objeto scanner para entradas via terminal
				Scanner scan = new Scanner(System.in);
				//Lendo a primeira entrada
				System.out.println("Type the first number:");
				int number1 = scan.nextInt();
				//Lendo a segunda entrada
				System.out.println("Type the second number:");
				int number2 = scan.nextInt();
				//Fechando o scanner
				scan.close();
				
				headerTerminal(true);
				count(number1, number2);

				restart = false;
			} catch (InputMismatchException e) {
				headerTerminal(false);
				System.out.println("INVALID FORMART!!!\nInsert a integer number\n");
			}
		} while (restart);
    }

	static void count(int number1, int number2) {
		if(number1 < number2) {
			for(int count = 1; number1 <= number2; count++) {
				System.out.println("imprimindo o número " + count + ": " + number1);
				number1++;
			}
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
