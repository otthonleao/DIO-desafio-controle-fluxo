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

		headerTerminal();
		count(number1, number2);

		// try {
		// 	count(number1, number2);
		// } catch (InputMismatchException e) {
		// 	JOptionPane.showMessageDialog(null, "You need insert a integer number");
		// }
		
    }

	static void count(int number1, int number2) {
		boolean restart = true;

		do {
			// if(number1 < number2) {
			// 	for(int count = 1; number1 <= number2; count++) {
			// 		System.out.println("imprimindo o número " + count + ": " + number1);
			// 		number1++;
			// 	}
			// }

			try {
				if(number1 < number2) {
					for(int count = 1; number1 <= number2; count++) {
						System.out.println("imprimindo o número " + count + ": " + number1);
						number1++;
					}
				}
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "You need insert a integer number");
			}
			restart = false;
		} while(restart); //Executa o programa novamente se der algum erro
	}

	static void headerTerminal() {
		System.out.println("\n=======================");
		System.out.println("=    START COUNTER    =");
		System.out.println("=======================");
	}
}
