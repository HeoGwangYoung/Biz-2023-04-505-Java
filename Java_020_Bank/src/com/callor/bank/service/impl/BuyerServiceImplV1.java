package com.callor.bank.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.model.BuyerDto;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.Line;

public class BuyerServiceImplV1 implements BuyerService {

	protected List<BuyerDto> buyerList;

	public BuyerServiceImplV1() {
		buyerList = new ArrayList<>();
	}

	@Override
	public void loadBuyer() {
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream("src/com/callor/bank/datas/buyerA.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] buyer = line.split(",");
			
			BuyerDto buDto = new BuyerDto();
			buDto.buId = buyer[0];
			buDto.buName = buyer[1];
			buDto.buTel = buyer[2];
			buDto.buAddr = buyer[3];
			buDto.buBirth = buyer[4];
			buDto.buJob = buyer[5];
			
			buyerList.add(buDto);
		}
	}

	@Override
	public BuyerDto getBuyer(String buId) {
		// TODO Auto-generated method stub
		return null;
	}

	protected String findMaxBuyerId() {
		String maxID = buyerList.get(0).buId;
		for (BuyerDto buyerDto : buyerList) {
			String id = buyerDto.buId;
			if(Integer.parseInt(maxID) < Integer.parseInt(id)) {
				maxID = id;
			}
		}
		
		maxID = String.format("%04d", Integer.parseInt(maxID) + 1);
		
		
		
		return maxID;
	}
	
	@Override
	public void inputBuyer() {
		// 키보드에서 고객정보를 입력받은 후 List<BuyerDto> type의 buyerList 리스트에 추가

//		고객ID		문자열(10)	buId
//		 * 고객이름		문자열		buName
//		 * 전화번호		문자열		buTel
//		 * 주소			문자열		buAddr
//		 * 생년월일		문자열		buBirth
//		 * 직업			문자열		buJob
		
		
		Scanner scan = new Scanner(System.in);

		// 전체적인 입력 반복을 위한 while
		while (true) {
			
			int intID = 0;
			BuyerDto buDto = new BuyerDto();
			// 값에 대한 검증을 하기 위한 while
			while (true) {
				try {
					String lastId = null;
					
					if(buyerList.size() > 0) {
						lastId = findMaxBuyerId();
					}
					
					System.out.println(Line.sLine(100));
					System.out.printf("고객의 ID를 입력해주세요(%s) (종료 : QUIT)>> ", lastId == null ? "신규" : lastId);
					
					String input = scan.nextLine();
					
					if(input.equals("QUIT")) {
						break;
					}else if(input.equals("")) {
						if(lastId == null) {
							System.out.println("다시 입력해주세요");
							continue;
						}
						intID = Integer.parseInt(lastId);
					}else {
						intID = Integer.parseInt(input);
					}
					
				} catch (Exception e) {
					System.out.println("정수로만 입력해주세요");
					continue;
				}
				if (intID < 0) {
					System.out.println("0이상의 정수를 입력해주세요");
					continue;
				}
				
				break;
			}
			if (intID == 0) {
				break;
			}

			buDto.buId = String.format("%04d", intID);
			
			
			boolean isDup = false;
			for (BuyerDto buyerDto : buyerList) {
				if (buDto.buId.equals(buyerDto.buId)) {
					buDto = buyerDto;
					System.out.println("동일한 id가 있습니다 기존정보를 수정합니다");
					isDup = true;
					break;
				}
			}

			String str;
			
			System.out.printf("고객의 이름을 입력해주세요\t(%s) (종료 : QUIT) >> ", buDto.buName == null ? "신규" : buDto.buName);
			str = scan.nextLine();
			if(str.equals("QUIT")) {
				break;
			}
			buDto.buName = str;
			
			System.out.printf("고객의 전화번호를 입력해주세요  (%s) (종료 : QUIT) >> ", buDto.buTel == null ? "신규" : buDto.buTel);
			str = scan.nextLine();
			if(str.equals("QUIT")) {
				break;
			}
			buDto.buTel = str;

			System.out.printf("고객의 주소를 입력해주세요\t(%s) (종료 : QUIT) >> ", buDto.buAddr == null ? "신규" : buDto.buAddr);
			str = scan.nextLine();
			if(str.equals("QUIT")) {
				break;
			}
			buDto.buAddr = str;

			System.out.printf("고객의 생년월일을 입력해주세요  (%s) (종료 : QUIT) >> ", buDto.buBirth == null ? "신규" : buDto.buBirth);
			str = scan.nextLine();
			if(str.equals("QUIT")) {
				break;
			}
			buDto.buBirth = str;

			System.out.printf("고객의 직업을 입력해주세요\t(%s) (종료 : QUIT) >> ", buDto.buJob == null ? "신규" : buDto.buJob);
			str = scan.nextLine();
			if(str.equals("QUIT")) {
				break;
			}
			buDto.buJob = str;
			System.out.println(Line.sLine(100));
			if(!isDup) {
				buyerList.add(buDto);
			}
		}
		
		System.out.println("고객 정보 입력종료");
		// 입력종료
		OutputStream os = null;
		PrintWriter out = null;
		
		try {
			os = new FileOutputStream("src/com/callor/bank/datas/buyerA.txt");
			out = new PrintWriter(os);
			
			for (BuyerDto dto : buyerList) {
				out.print(dto.buId + ",");
				out.print(dto.buName + ",");
				out.print(dto.buTel + ",");
				out.print(dto.buBirth  + ",");
				out.print(dto.buAddr + ",");
				out.println(dto.buJob);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("저장할 파일을 찾을수 없습니다");
		}
		
		out.close();
		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void printBuyerList() {
		OutputStream os = System.out;
		PrintWriter out = new PrintWriter(os);
		
		System.out.println(Line.dLine(100));
		System.out.println("고객 정보 리스트");
		System.out.println(Line.dLine(100));
		System.out.println("고객ID\t고객명\t전화번호\t주소\t생년월일\t직업");
		printBuyerList(out);
		out.close();
		System.out.println(Line.dLine(100));
	}
	/*
	 * 매개변수로 전달받는 PrintWriter 객체의 구분에 따라 화면에 출력하거나 파일로 출력하기
	 */
	@Override
	public void printBuyerList(PrintWriter out) {
		// TODO Auto-generated method stub
		for (BuyerDto dto : buyerList) {
			out.printf("%s\t", dto.buId);
			out.printf("%s\t", dto.buName);
			out.printf("%s\t", dto.buTel);
			out.printf("%s\t", dto.buAddr);
			out.printf("%s\t", dto.buBirth );
			out.printf("%s\n", dto.buJob);
		}
	}
}