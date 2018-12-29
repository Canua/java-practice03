package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		while (true) {
			System.out.print(">> ");
			String expression = scanner.nextLine();

			if (expression.equals("exit"))
				break;
			String[] tokens = expression.split(" ");
			int left_num = Integer.parseInt(tokens[0]);
			int right_num = Integer.parseInt(tokens[2]);

			switch (tokens[1]) {
			case "+":
				add.setValue(left_num, right_num);
				System.out.println(">> " + add.calculate());
				break;
			case "-":
				sub.setValue(left_num, right_num);
				System.out.println(">> " + sub.calculate());
				break;
			case "*":
				mul.setValue(left_num, right_num);
				System.out.println(">> " + mul.calculate());
				break;
			case "/":
				div.setValue(left_num, right_num);
				System.out.println(">> " + div.calculate());
				break;
			}
		}
	}
}
