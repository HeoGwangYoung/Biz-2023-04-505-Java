package com.callor.classes.exec;

import java.util.Scanner;

import com.callor.classes.module.MyClassA;

public class ExecD {

	public static void main(String[] args) {
		
		/* 
		 * MyClassA class type myA 객체를 선언하고, MyClassA() 생성자 method를 사용하여 myA객체를 초기화한다
		 */
		MyClassA myA = new MyClassA();
		
		/*
		 * String class type의 str 객체를 선언하고, String() 생성자 method를 사용하여 str객체를 초기화한다
		 */
		String str = new String("Republic of Korea");
		
		/*
		 * Scanner class type의 scan객체를 선언하고 Scanner() 생성자 method를 사용하여 scan객체를 초기화한다
		 */
		Scanner scan = new Scanner(System.in);
		
		/*
		 * class type의 객체를 선언하고 
		 * - class type이란 변수 선언 keyword가 class
		 * - class tpye으로 선언된 변수를 객체라고 한다
		 * - 선언되지 않은 변수는 초기화, 저장, 읽기, 쓰기 등이 일체 허용되지 않는다
		 * 
		 * 객체를 생성자 method를 사용하여 초기화 한다
		 * - 객체 (변수)를 완전히 사용가능한 상태로 만들기
		 * - 객체 (변수)를 초기화 하지 않으면, 일부 기능만 사용할수 있다
		 * 
		 * 일반 변수는 값을 저장, 할당, 대입 하면 초기화가 된다
		 * 객체는 클래스의 생성자 method()를 사용하여 초기화 한다
		 */
		
		int num1;
		num1 = 0;
	}
}
