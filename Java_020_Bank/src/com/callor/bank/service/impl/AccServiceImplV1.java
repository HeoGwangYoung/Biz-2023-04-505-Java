package com.callor.bank.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.model.AccDto;
import com.callor.bank.model.BuyerDto;
import com.callor.bank.service.AccService;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.AnsiConsol;
import com.callor.bank.utils.Config;
import com.callor.bank.utils.Line;

public class AccServiceImplV1 implements AccService {

	List<AccDto> accList;
	Scanner scan;
	BuyerService buyerService;

	public AccServiceImplV1() {
		accList = new ArrayList<>();
		scan = new Scanner(System.in);
		buyerService = new BuyerServiceImplV1();
	}

	protected String getNewAccNum() {

		// 컴퓨터의 현재 시각을 get 하는 클래스
		// System.currentTimeMillis()
		// 1970.1.1 00:00:00.000 부터 시작하여
		// 현재시점까지 카운트된 밀리세컨드 값
		// 이 값을 Date 클래스의 생성자에 전달하면
		// 현재 날짜, 시각 정보를 알수 있는 객체로 생성해 준다
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = todayFormat.format(date);
		
		
		int maxNum = 0;
		String numBank = "1000";
		
		
		//리스트 비어있을경우 건너뜀
		for (AccDto accDto : accList) {
			// 1000-2023-05-18-0001
			// 1000-2023-05-18-0002
			// 1000-2023-05-18-0003
			// 1000-2023-05-18-0004
			// 1000-2023-05-18-0005
			String accNum = accDto.acNum;
			
			// test code
			System.out.println("들어온 데이터 : " + accNum);

			// 처음의 4글자를 잘라서 bank 코드 추출하기
			numBank = accNum.substring(0, 4);

			// 날짜 부분 추출하기
			String numDate = accNum.substring(numBank.length(), numBank.length() + todayString.length());
			
			//test code
			System.out.println("numDate : " + numDate);

			if (numDate != null && numDate.equals(todayString)) {
				// 일련번호 부분만 추출하기
				String strLastNum = accNum.substring(numBank.length() + todayString.length());
				
				System.out.println("numBank 길이 :" + numBank.length()); // 4
				System.out.println("todayString 길이 :" + todayString.length()); // 10
				
				
				//test code
				System.out.println("LastNum : " + strLastNum);
				
				
				int lastNum = Integer.valueOf(strLastNum);
				if (maxNum < lastNum)
					maxNum = lastNum;
			}
		} // end for

		// maxNum 는 0또는 최대값
		String newNum = String.format("%s%s%04d", numBank, todayString, maxNum + 1);
		return newNum;
	}

	@Override
	public void accInit() {
		Config.bankTitle("계좌생성");
		
		while(true) {
			
			String accNum = getNewAccNum();
			System.out.println(Line.sLine(100));
			System.out.println("생성된 계좌번호 : " + accNum);
			System.out.println(Line.sLine(100));
			
			String strBuid = "";
			while(true) {
				System.out.println("고객 번호를 입력해 주세요");
				System.out.print("고객번호 >> ");
				strBuid = scan.nextLine();
				if(strBuid.equals("QUIT")) break;
				
				try {
					int intBuid = Integer.valueOf(strBuid);
					strBuid = String.format("%04d", intBuid);
					
					BuyerDto buyerDto = buyerService.getBuyer(strBuid);
					if(buyerDto == null) {
						System.out.println(AnsiConsol.message("RED", "고객정보가 없습니다"));
						System.out.println("고객정보를 먼저 등록해 주세요");
					} else {
						System.out.println(Line.sLine(100));
						System.out.println(buyerDto.toString());
						System.out.println(Line.sLine(100));
						
						// 0519 작성
						AccDto accDto = new AccDto();
						accDto.acNum = accNum;
						accDto.buId = buyerDto.buId;
						accDto.acBalance = 0;
						accDto.acDiv = "계좌구분";
						accList.add(accDto);
						System.out.println("계좌를 해당고객에게 발급합니다");
						
						break;
					}
					
				} catch (Exception e) {
					System.out.println("고객 번호는 정수로 입력");
				}
				
			}
		}
	}

	@Override
	public void inout() {
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.print("업무를 선택하세요 (1. 입금하기 2. 출금하기 3. 종료) >> ");
//			String strSelect = scan.nextLine();
//			int select = 0;
//			try {
//				select = Integer.parseInt(strSelect);
//			} catch (Exception e) {
//				System.out.println("잘못된 입력입니다");
//				continue;
//			}
//			
//			AccDto accDto = new AccDto();
//			accDto.acNum = "0001";
//			
//			String credit = null;
//			
//			if(select == 1) {
//				System.out.print("입금액을 입력해주세요 >> ");
//				credit = scan.nextLine();
//				
//				accDto.acInput += Integer.parseInt(credit);
//				System.out.println("잔액 : " + (accDto.acInput - accDto.acOutput));
//				
//			}else if(select == 2) {
//				System.out.print("출금액을 입력해주세요 >> ");
//				credit = scan.nextLine();
//				
//				if(accDto.acOutput + Integer.parseInt(credit) < accDto.acInput) {
//					accDto.acOutput += Integer.parseInt(credit);
//				} else {
//					System.out.println("출금 거부");
//				}
//				System.out.println("잔액 : " + (accDto.acInput - accDto.acOutput));
//				
//			}else if(select == 3) {
//				System.out.println("업무를 종료합니다");
//				break;
//			}
//			
//			accList.add(accDto);
//		}

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
