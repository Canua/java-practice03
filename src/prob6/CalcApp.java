package prob6;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calc calc = new Calc();
		while (true) {
			System.out.print(">> ");
			String expression = scanner.nextLine();
			String[] tokens = expression.split(" ");
			int left_num = Integer.parseInt(tokens[0]);
			int right_num = Integer.parseInt(tokens[2]);
			switch (tokens[1]) {
			case "+":
				System.out.println(">> " + calc.add(left_num, right_num));
				break;
			case "-":
				System.out.println(">> " + calc.sub(left_num, right_num));
				break;
			case "*":
				System.out.println(">> " + calc.mul(left_num, right_num));
				break;
			case "/":
				System.out.println(">> " + calc.div(left_num, right_num));
				break;
			}
			if (tokens[0].equals("exit")) {
				break;
			}
		}
	}

}
