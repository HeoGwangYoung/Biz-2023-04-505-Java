package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.model.AccDto;
import com.callor.bank.service.AccService;

public class AccServiceImplV1 implements AccService{

	List<AccDto> accList;
	public AccServiceImplV1() {
		accList = new ArrayList<>();
	}

	@Override
	public void accInit() {
		
		
	}

	@Override
	public void inout() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("업무를 선택하세요 (1. 입금하기 2. 출금하기 3. 종료) >> ");
			String strSelect = scan.nextLine();
			int select = 0;
			try {
				select = Integer.parseInt(strSelect);
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			AccDto accDto = new AccDto();
			accDto.acNum = "0001";
			
			String credit = null;
			
			if(select == 1) {
				System.out.print("입금액을 입력해주세요 >> ");
				credit = scan.nextLine();
				
				accDto.acInput += Integer.parseInt(credit);
				System.out.println("잔액 : " + (accDto.acInput - accDto.acOutput));
				
			}else if(select == 2) {
				System.out.print("출금액을 입력해주세요 >> ");
				credit = scan.nextLine();
				
				if(accDto.acOutput + Integer.parseInt(credit) < accDto.acInput) {
					accDto.acOutput += Integer.parseInt(credit);
				} else {
					System.out.println("출금 거부");
				}
				System.out.println("잔액 : " + (accDto.acInput - accDto.acOutput));
				
			}else if(select == 3) {
				System.out.println("업무를 종료합니다");
				break;
			}
			
			accList.add(accDto);
		}
		
	}

	@Override
	public void printAccList() {
		
		
	}

	@Override
	public void saveAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub
		
	}

}
