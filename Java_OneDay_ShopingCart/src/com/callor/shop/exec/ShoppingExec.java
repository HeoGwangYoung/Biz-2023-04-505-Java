package com.callor.shop.exec;

import java.util.Scanner;

import com.callor.shop.Config;
import com.callor.shop.service.impl.ShoppingService;
import com.callor.shop.service.impl.ShoppingServiceImplV1;

public class ShoppingExec {
	public static void main(String[] args) {
		ShoppingService service = new ShoppingServiceImplV1();
		Scanner scan = new Scanner(System.in);
		int input = 0;

		while (true) {
			Config.shoppingTitle();
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				break;
			}

			try {
				input = Integer.parseInt(strInput);
			} catch (Exception e) {
				System.out.println("1 ~ 7 정수만 입력할 수 있습니다");
				continue;
			}

			if (input == 1) {
				service.printProductList();
			} else if (input == 2) {
				service.insertProduct();
			} else if (input == 3) {
				service.printBuyerList();
			} else if (input == 4) {
				service.insertBuyer();
			} else if (input == 5) {
				service.insertIoList();
			} else if (input == 6) {
				service.printIoList_Buyer();
			} else if (input == 7) {
				service.printIoList();
			} else {
				System.out.println("1 ~ 7 정수만 입력할 수 있습니다");
			}
		}
	}
}
