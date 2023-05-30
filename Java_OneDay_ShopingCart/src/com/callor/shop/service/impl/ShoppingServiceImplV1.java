package com.callor.shop.service.impl;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.callor.shop.config.DBConnection;
import com.callor.shop.mapper.BuyerDao;
import com.callor.shop.mapper.IoListDao;
import com.callor.shop.mapper.ProductDao;
import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.IolistDto;
import com.callor.shop.models.ProductDto;

public class ShoppingServiceImplV1 implements ShoppingService{

	Scanner scan;
	SqlSession sqlSession;

	ProductDao productDao;
	BuyerDao buyerDao;
	IoListDao ioListDao;

	List<ProductDto> prList;
	List<BuyerDto> buList;
	List<IolistDto> ioList;

	public ShoppingServiceImplV1() {
		scan = new Scanner(System.in);
		sqlSession = DBConnection.getFactory().openSession(true);
		productDao = sqlSession.getMapper(ProductDao.class);
		buyerDao = sqlSession.getMapper(BuyerDao.class);
		ioListDao = sqlSession.getMapper(IoListDao.class);
	}

	protected String getMaxId() {
		buList = buyerDao.selectAll();

		if (buList == null || buList.isEmpty()) {
			return "0000000001";
		}

		int intMaxId = 0;
		for (BuyerDto buDto : buList) {
			if (intMaxId < Integer.parseInt(buDto.buId)) {
				intMaxId = Integer.parseInt(buDto.buId);
			}
		}

		String MaxId = String.format("%010d", intMaxId + 1);

		return MaxId;
	}

	protected String getDate() {

		// 컴퓨터의 현재 시각을 get 하는 클래스
		// System.currentTimeMillis()
		// 1970.1.1 00:00:00.000 부터 시작하여
		// 현재시점까지 카운트된 밀리세컨드 값
		// 이 값을 Date 클래스의 생성자에 전달하면
		// 현재 날짜, 시각 정보를 알수 있는 객체로 생성해 준다
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = todayFormat.format(date);

		return todayString;
	}

	protected String getTime() {
		LocalTime time = LocalTime.now(); // 현재 시간 받아오기

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // 시간 형식 지정
		String formattedTime = time.format(formatter); // 형식에 맞게 시간을 문자열로 변환

		return formattedTime;
	}

	public void printProductList() {
		prList = productDao.selectAll();

		System.out.println("=".repeat(120));
		System.out.println("상품 리스트");
		System.out.println("=".repeat(120));
		System.out.println("상품코드\t상품명\t품목\t매입단가\t매출단가");
		System.out.println("-".repeat(120));
		for (ProductDto prDto : prList) {
			System.out.print(prDto.pCode + "\t");
			System.out.print(prDto.pName + "\t");
			System.out.print(prDto.pItem + "\t");
			System.out.print(prDto.pIPrice + "\t\t");
			System.out.print(prDto.pOPrice + "\n");
		}
		System.out.println("-".repeat(120));
	}

	public void insertProduct() {
		ProductDto prDto;

		System.out.println("2입력");
		System.out.println("상품정보를 등록합니다");

		System.out.print("상품코드를 입력해주세요 >>");
		String code = scan.nextLine();
		prDto = productDao.findById(code);
		if (prDto != null) {
			System.out.println("상품정보를 수정합니다");
		}

		System.out.print("상품이름을 입력해주세요 >>");
		String name = scan.nextLine();

		System.out.print("품목을 입력해주세요 >>");
		String item = scan.nextLine();

		int inPrice = 0;
		while (true) {
			System.out.print("매입단가을 입력해주세요 >>");
			String strInprice = scan.nextLine();

			try {
				inPrice = Integer.parseInt(strInprice);
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다 다시 입력해주세요");
			}

			if (inPrice <= 100) {
				System.out.println("100원이상으로 입력하세요");
				continue;
			}

			break;
		}

		int outPrice = (int) (inPrice + (inPrice * 0.22));
		outPrice = (int) Math.round(outPrice / 10.0) * 10;

		if (prDto == null) {
			prDto = new ProductDto();
			prDto.pCode = code;
			prDto.pName = name;
			prDto.pItem = item;
			prDto.pIPrice = inPrice;
			prDto.pOPrice = outPrice;

			productDao.insert(prDto);
		} else {
			prDto.pName = name;
			prDto.pItem = item;
			prDto.pIPrice = inPrice;
			prDto.pOPrice = outPrice;

			productDao.update(prDto);
		}
	}

	public void printBuyerList() {
		buList = buyerDao.selectAll();

		System.out.println("=".repeat(120));
		System.out.println("고객 리스트");
		System.out.println("=".repeat(120));
		System.out.println("고객ID\t고객이름\t전화번호\t주소");
		System.out.println("-".repeat(120));
		for (BuyerDto buDto : buList) {
			System.out.print(buDto.buId + "\t");
			System.out.print(buDto.buName + "\t");
			System.out.print(buDto.buTel + "\t");
			System.out.print(buDto.buAddr + "\n");
		}
		System.out.println("-".repeat(120));
	}

	public void insertBuyer() {
		String maxId = getMaxId();
		BuyerDto buDto;

		System.out.println("고객정보를 등록합니다");
		System.out.printf("ID를 입력해주세요(%s) >> ", maxId);
		String id = scan.nextLine();
		buDto = buyerDao.findById(id);
		if (buDto != null) {
			System.out.println("고객정보를 수정합니다");
		}

		System.out.print("이름을 입력해주세요 >> ");
		String name = scan.nextLine();
		System.out.print("전화번호를 입력해주세요 >> ");
		String tel = scan.nextLine();
		System.out.print("주소를 입력해주세요 >> ");
		String adr = scan.nextLine();

		if (buDto == null) {
			buDto = new BuyerDto();
			buDto.buId = id;
			buDto.buName = name;
			buDto.buTel = tel;
			buDto.buAddr = adr;

			buyerDao.insert(buDto);
		} else {
			buDto.buName = name;
			buDto.buTel = tel;
			buDto.buAddr = adr;

			buyerDao.update(buDto);
		}
	}

	public void insertIoList() {
		System.out.println("5 입력");
		System.out.println("장바구니 상품담기 서비스 입니다");

		System.out.print("고객ID를 입력해주세요 >> ");
		String id = scan.nextLine();
		if (buyerDao.findById(id) == null) {
			System.out.println("입력하신 id와 매칭되는 고객이 존재하지 않습니다");
			return;
		}

		System.out.print("상품코드를 입력해주세요 >> ");
		String code = scan.nextLine();
		ProductDto prDto = productDao.findById(code);
		if (prDto == null) {
			System.out.println("입력하신 코드와 매칭되는 상품이 존재하지 않습니다");
			return;
		}
		int price = prDto.pOPrice;

		int quan = 0;
		while (true) {
			System.out.print("수량을 입력해주세요 >> ");
			String strQuan = scan.nextLine();

			try {
				quan = Integer.parseInt(strQuan);
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			if (quan <= 0) {
				System.out.println("1 이상으로 입력해주세요");
				continue;
			}

			break;
		}

		String date = getDate();
		String time = getTime();

		IolistDto ioDto = new IolistDto();
		ioDto.ioDate = date;
		ioDto.ioTime = time;
		ioDto.ioBuId = id;
		ioDto.ioPCode = code;
		ioDto.ioQuan = quan;
		ioDto.ioPrice = price;

		ioListDao.insert(ioDto);
	}

	public void printIoList_Buyer() {

		System.out.print("고객ID를 입력해주세요 >> ");
		String id = scan.nextLine();
		BuyerDto buDto = buyerDao.findById(id);
		if (buDto == null) {
			System.out.println("입력하신 id와 매칭되는 고객이 존재하지 않습니다");
			return;
		}

		ioList = ioListDao.findById(id);
		if (ioList == null) {
			System.out.println("입력하신 고객의 장바구니는 비어있습니다");
			return;
		}

		System.out.println("=".repeat(120));
		System.out.printf("%s 님의 장바구니\n", buDto.buName);
		System.out.println("=".repeat(120));
		System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t상품명\t판매단가\t수량\t판매합계");
		for (IolistDto ioDto : ioList) {
			System.out.print(ioDto.ioDate + "\t");
			System.out.print(ioDto.ioTime + "\t");
			System.out.print(buDto.buId + "\t");
			System.out.print(buDto.buName + "\t");
			System.out.print(buDto.buTel + "\t");
			System.out.print(ioDto.ioPCode + "\t");
			ProductDto prDto = productDao.findById(ioDto.ioPCode);
			System.out.print(prDto.pName + "\t");
			System.out.print(ioDto.ioPrice + "\t\t");
			System.out.print(ioDto.ioQuan + "\t");
			System.out.print(ioDto.ioPrice * ioDto.ioQuan + "\n");
		}

	}

	public void printIoList() {
		System.out.println("거래리스트 출력 서비스입니다");
		ioList = ioListDao.selectAll();

		System.out.println("1. 전체 거래 리스트");
		System.out.println("2. 기간별 거래 리스트");
		System.out.println("3. 고객별 거래 리스트");
		System.out.println("4. 상품별 거래 리스트");
		System.out.println("5. 고객 + 거래 기간별 거래 리스트");

		System.out.print("입력 >> ");
		String input = scan.nextLine();

		if (input.equals("1")) {
			printList();
		} else if (input.equals("2")) {
			
			System.out.print("처음 날짜를 입력해주세요 >> ");
			String firstInput = scan.nextLine();
			System.out.println("마지막 날짜를 입력해주세요");
			String secondInput = scan.nextLine();
			ioList = ioListDao.findByDate(firstInput, secondInput);

			if (ioList == null) {
				System.out.println("검색결과가 존재하지 않습니다");
				return;
			}
			printList();

		} else if (input.equals("3")) {

			System.out.print("고객ID를 입력해주세요 >> ");
			String id = scan.nextLine();
			BuyerDto buDto = buyerDao.findById(id);
			if (buDto == null) {
				System.out.println("입력하신 id와 매칭되는 고객이 존재하지 않습니다");
				return;
			}

			ioList = ioListDao.findById(id);
			if (ioList == null) {
				System.out.println("입력하신 고객의 장바구니는 비어있습니다");
				return;
			}
			
			printList();
		} else if (input.equals("4")) {
			System.out.print("상품코드를 입력해주세요 >> ");
			String code = scan.nextLine();
			ProductDto prDto = productDao.findById(code);
			if (prDto == null) {
				System.out.println("입력하신 code와 매칭되는 상품이 존재하지 않습니다");
				return;
			}

			ioList = ioListDao.findByCode(code);
			if (ioList == null) {
				System.out.println("입력하신 상품을 구매한 고객은 존재하지 않습니다");
				return;
			}
			
			printList();
		} else if (input.equals("5")) {
			System.out.print("고객ID를 입력해주세요 >> ");
			String id = scan.nextLine();
			BuyerDto buDto = buyerDao.findById(id);
			if (buDto == null) {
				System.out.println("입력하신 id와 매칭되는 고객이 존재하지 않습니다");
				return;
			}
			
			System.out.print("처음 날짜를 입력해주세요 >> ");
			String firstInput = scan.nextLine();
			System.out.println("마지막 날짜를 입력해주세요");
			String secondInput = scan.nextLine();
			ioList = ioListDao.findByDateAndId(firstInput, secondInput, id);

			if (ioList == null) {
				System.out.println("검색결과가 존재하지 않습니다");
				return;
			}
			
			printList();
		} else {
			System.out.println("잘못된 입력입니다");
			return;
		}
	}
	
	protected void printList() {
		System.out.println("=".repeat(120));
		System.out.println("상품 판매 리스트");
		System.out.println("=".repeat(120));
		System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t상품명\t판매단가\t수량\t판매합계");

		for (IolistDto ioDto : ioList) {

			System.out.print(ioDto.ioDate + "\t");
			System.out.print(ioDto.ioTime + "\t");

			System.out.print(ioDto.ioBuId + "\t");
			BuyerDto buDto = buyerDao.findById(ioDto.ioBuId);
			System.out.print(buDto.buName + "\t");
			System.out.print(buDto.buTel + "\t");

			System.out.print(ioDto.ioPCode + "\t");
			ProductDto prDto = productDao.findById(ioDto.ioPCode);
			System.out.print(prDto.pName + "\t");
			System.out.print(ioDto.ioPrice + "\t\t");
			System.out.print(ioDto.ioQuan + "\t");
			System.out.print(ioDto.ioPrice * ioDto.ioQuan + "\n");
		}
	}

	
}
