package prob6.refactoring;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print(">> ");
			String expression = scanner.nextLine();

			if (expression.equals("exit"))
				break;
			String[] tokens = expression.split(" ");

			String operator = tokens[1];
			int left_num = Integer.parseInt(tokens[0]);
			int right_num = Integer.parseInt(tokens[2]);

			Arith arith = null;

			switch (operator) {
			case "+": {
				arith = new Add();
				break;
			}
			case "-": {
				arith = new Sub();
				break;
			}
			case "*": {
				arith = new Mul();
				break;
			}
			case "/": {
				arith = new Div();
				break;
			}
			default: {
				break;
			}
			}
			if (arith == null) {
				System.out.println(">> 알 수 없는 연산입니다.");
				continue;
			}
			arith.setValue(left_num, right_num);
			int result = arith.calculate();
			System.out.println(">> " + result);
		}
		scanner.close();
	}
}
