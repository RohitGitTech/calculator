package calculator_mini_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		String yn;
		do {
			Scanner scr = new Scanner(System.in);

			System.out.println("Enter the first Number:");
			int no1 = scr.nextInt();

			System.out.println("Enter the second number");
			int no2 = scr.nextInt();

			System.out.println("Select the Symbol(+,-,*,/)");
			String sym = scr.next();
			int res;

			switch (sym) {

			case "+":
				res = no1 + no2;
				System.out.println("Addition is :" + res);
				break;

			case "-":
				res = no1 - no2;
				System.out.println("Substraction is :" + res);
				break;

			case "*":
				res = no1 * no2;
				System.out.println("Multiplication is :" + res);
				break;

			case "/":
				res = no1 / no2;
				System.out.println("Dividation is :" + res);
				break;

			default:
				System.out.println("Invalid Symbol");
				break;
			}
			System.out.println("Do you want to continue(press y for yes and n for NO)");
			yn = scr.next();
		} while (yn.equals("y") || yn.equals("Y"));

	}
}

