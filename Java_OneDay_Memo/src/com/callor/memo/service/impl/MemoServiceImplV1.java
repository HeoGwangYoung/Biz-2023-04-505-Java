package com.callor.memo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;

public class MemoServiceImplV1 {

	protected List<MemoDto> memoList;
	protected Scanner scan;
	protected SqlSession sqlSession;
	protected MemoDao memoDao;

	public MemoServiceImplV1() {
		scan = new Scanner(System.in);
		sqlSession = DBConnection.getFactory().openSession(true);
		memoDao = sqlSession.getMapper(MemoDao.class);
	}

	
	// 더 해야 될것
	// 1. 인터페이스 작성
	// 2. 메뉴 메서드 분류시키기
	// 3. Update
	// 4. Delete
	// 5. 작성자 조회
	
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

	protected MemoDto inputMemo() {

		while (true) {


			System.out.print("작성자를 입력해주세요 >> ");
			String writer = scan.nextLine();

			String subject = "";
			while (true) {
				System.out.print("제목을 입력해주세요 >> ");
				subject = scan.nextLine();

				if (subject.equals("")) {
					System.out.println("제목은 필수 입력사항입니다");
					continue;
				}

				break;
			}

			System.out.print("내용을 입력해주세요 >> ");
			String content = scan.nextLine();

			
			String date = this.getDate();

			
			MemoDto memoDto = new MemoDto();
			memoDto.m_writer = writer;
			memoDto.m_subject = subject;
			memoDto.m_content = content;
			memoDto.m_date = date;

			return memoDto;
		}
	}

	public void insertMemo() {
		// 1. 메모작성 2. 메모번호로 메모내용 보기 3. 종료

		while (true) {

			System.out.println("=".repeat(60));
			System.out.println("메모장 프로그램 입니다");
			System.out.println("보기에 작성된 숫자를 입력해주세요");
			System.out.println("1. 메모작성");
			System.out.println("2. 메모번호로 메모내용 조회");
			System.out.println("3. 종료");
			System.out.println("-".repeat(60));
			System.out.print("입력 >> ");

			String input = scan.nextLine();

			if (input.equals("1")) {
				MemoDto memoDto = inputMemo();
				int result = memoDao.insert(memoDto);
				if (result > 0) {
					System.out.println("메모가 정상적으로 등록되었습니다");
				} else {
					System.out.println("메모가 정상적으로 등록되지 않았습니다");
				}
			} else if (input.equals("2")) {
				printMemo();
				
			} else if (input.equals("3")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다");
				continue;
			}
		}
	}
	
	public void printMemo() {
		memoList = memoDao.selectAll();
		
		System.out.println("메모를 검색하는 기능입니다");
		
		if(memoList.isEmpty()) {
			System.out.println("메모가 존재하지 않습니다");
			return;
		}
		
		int input = 0;
		while(true) {
			System.out.print("조회하실 메모 번호를 입력해주세요 ( 전체 메모수 : " + memoList.size() + " ) >> ");
			String strInput = scan.nextLine();
			try {
				input = Integer.parseInt(strInput);
			} catch (Exception e) {
				System.out.println("정수만 입력해주세요");
			}
			
			if(input > memoList.size() || input < 1) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			break;
		}
		
		MemoDto memoDto = memoDao.findById(input);
		System.out.println("=".repeat(60));
		System.out.println("검색하신 내용을 표시합니다");
		System.out.println("작성자   : " + memoDto.m_writer);
		System.out.println("작성일자 : " + memoDto.m_date);
		System.out.println("제목     : " + memoDto.m_subject);
		System.out.println("내용     : " + memoDto.m_content);
	}
	
}
