package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			String name = tokens[0];
			int price = Integer.parseInt(tokens[1]);
			int num = Integer.parseInt(tokens[2]);
			arrayGoods[i] = new Goods();
			arrayGoods[i].setName(name);
			arrayGoods[i].setPrice(price);
			arrayGoods[i].setNum(num);

		}
		for (int i = 0; i < arrayGoods.length; i++) {
			System.out.println(arrayGoods[i].getName() + "(가격:" + arrayGoods[i].getPrice() + "원)이 "
					+ arrayGoods[i].getNum() + "개 입고 되었습니다.");
		}
	}
}
