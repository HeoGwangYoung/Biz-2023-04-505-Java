package com.callor.classes.models;

public class StudentDto {

	/*
	 * 클래스 변수
	 * 속성 (Attribute)
	 * 필드 (Field)
	 * public 접근제한자가 설정되어 있기 때문에 변수에 직접 접근이 가능하다
	 */
	public String stNum;
	public String stName;
	public String stDept;
	public int stGrade;
	public String stTel;
	public String stAddress;
	
	public StudentDto(String stNum, String stName, String stDept, int stGrade, String stTel, String stAddress) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stDept = stDept;
		this.stGrade = stGrade;
		this.stTel = stTel;
		this.stAddress = stAddress;
	}

	public StudentDto() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stGrade=" + stGrade
				+ ", stTel=" + stTel + ", stAddress=" + stAddress + "]";
	}
	
}
