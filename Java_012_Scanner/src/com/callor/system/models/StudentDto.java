package com.callor.system.models;

/*
 * Ŭ������ ��� ����, ��� method
 * 		���** : ������ Ŭ���� scope ���ο��� ����� ����, method
 * 		��� ���� : field, ��ü ����, �Ӽ�, Attribute
 * Dto Ŭ������ ��� ������ ���� ������
 * 		���������ڴ� public, private, protected �� �ִµ�
 * 		��� ����, ��� method�� ���������ڰ� ������
 * 		
 * 		1. package �� �ٸ� ������ ���** �� �����Ϸ��� �ϸ� ������ �ȵȴ�
 * 		2. public ���������ڰ� ������ package�� �� �������
 * 			���� ������Ʈ�� � �������� �����Ӱ� ������ ����
 * 		3. private ���������ڰ� ������ ���� Ŭ������ ��� method ������ ������ �����ϴ�
 * 
 * Dto Ŭ������ ��� ������ getter, setter method
 * 		java �� ������Ʈ ���Ͽ��� Dto Ŭ������ ��� ������ ��� private���� ����
 * 		private ���� ����� ��� ������ ���� ����, �б� ���Ͽ� setter, getter method�� ����
 * 
 * 		Dto Ŭ������ ��ü�� ������ �� ��� ������ �����ϱ� ���Ͽ�
 * 			��� ������ ���� ȣ������ �ʰ�, setter getter method�� ���Ͽ� �����Ѵ�
 */
public class StudentDto {

	private String stNum;
	private String stName;
	private String stDept;
	private int stGrade;
	private String stTel;
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	
	public int getStGrade() {
		return stGrade;
	}
	public void setStGrade(int stGrade) {
		this.stGrade = stGrade;
	}
	
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	/*
	 * StudentDto Ŭ������ ������ ��ü�� ��� ����(�Ӽ�)�� ����� ���� ���ڿ��� ����� return ���ִ� method
	 * 
	 * �����ڰ� ������ Ŭ������ ����Ͽ� ��ü������ �����ϸ� �⺻������ toString() �̶�� method�� �ڵ� �����ȴ�
	 * 		��, toString() method �� �ҽ��ڵ忡 ��Ÿ���� �ʴ´�
	 * 		������ ��ü to.String() ó�� method�� ����� �� �ִ�
	 * 		���� toString() method�� ��ü�� �����߿��� �޸� �ּ� ���� �˷��ִ� ���ڿ��� �����Ͽ� return �ϴ� �ڵ尡 ����ִ�
	 * 
	 * �⺻������ toString() method �� return �ϴ� ���ڿ��� ���� ȿ��(�ʿ�) ��ġ�� ����
	 * 		�׷���, ������ toString() method �ڵ带 ��������� ��������� ���� ���ڿ��� ����� return �ϴ� method��
	 * 		"�� ����(Override)" �ߴ� 
	 */
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum
				+ ", stName=" + stName
				+ ", stDept=" + stDept
				+ ", stGrade=" + stGrade
				+ ", stTel=" + stTel + "]";
	}
}
