package com.callor.student.models;

public class StudentDto {

	public String stNum;
	public String stName;
	public String stDept;
	public int stGrade;
	public String stTel;
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stGrade=" + stGrade
				+ ", stTel=" + stTel + "]";
	}
}
