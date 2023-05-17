package com.callor.bank.exec;

import com.callor.bank.service.BuyerService;
import com.callor.bank.service.impl.BuyerServiceImplV1;

public class BuyerExecA {

	public static void main(String[] args) {
		
		BuyerService buyService = new BuyerServiceImplV1();
		
		buyService.loadBuyer();
		buyService.inputBuyer();
		buyService.printBuyerList();
	}
}
