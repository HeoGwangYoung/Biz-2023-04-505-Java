package com.callor.bank.exec;

import java.io.PrintWriter;

import com.callor.bank.service.BuyerService;
import com.callor.bank.service.impl.BuyerServiceImplV1A;

public class BuyerExecAA {

	public static void main(String[] args) {
		BuyerService buservice = new BuyerServiceImplV1A();
		buservice.inputBuyer();
		
		/*
		 * printBuyerList() 에 전달할 출력방향을 화면으로 지정하여 전달
		 * PrintWriter out = new PrintWriter(System.out);
		 * 
		 * "내 파일"에 저장하기
		 * OutputStream os = new FileOutputStream("내파일");
		 * printWriter out = new PrintWriter(os);
		 */
//		PrintWriter out = new PrintWriter(System.out);
//		buservice.printBuyerList(out);
		buservice.printBuyerList();
		
		
//		out.close();
	}
}
