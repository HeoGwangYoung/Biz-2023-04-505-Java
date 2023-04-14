package com.callor.system.var;

public class VarBA {

	public static void main(String[] args) {
		// 작은 정수
		int intNum1 = 0;	//intNum => 헝가리안표기법
		// 단정도 실수
		float floatNum1 = 0.0f;
		// 큰 정수
		long longNum1 = 0;
		// 배정도 실수
		double douNum1 = 0.0;
		
		// 데이터의 형변환 (type cast, convert)
		
		// int형 데이터를 long형 변수에 저장
		longNum1 = intNum1; // 자동 형변환, 암시적 형변환
		
		// long형 데이터를 int형 변수에 저장
		intNum1 = (int)longNum1; // 강제 형변환, 명시적 형변환
		
		floatNum1 = (float)douNum1; // 강제 형변환
		douNum1 = floatNum1; // 자동 형변환
	}
}
