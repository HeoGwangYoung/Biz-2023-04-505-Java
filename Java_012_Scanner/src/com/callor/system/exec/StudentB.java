package com.callor.system.exec;

import com.callor.system.models.StudentDto;

public class StudentB {
	public static void main(String[] args) {
		StudentDto �̸��� = new StudentDto();

//		�̸���.stNum = "0001";
		// stNum ��� ������ ���ڿ� "0001"�� setting(����, �Ҵ�, ����)�� �޶�
		�̸���.setStNum("0001");
		
//		strNum = �̸���.stNum();
		//stNum ��� ������ ����� ���ڿ��� �о strNum ������ ���� �ش޶�
		String strNum = �̸���.getStNum();
		
		�̸���.setStNum("0001");
		�̸���.setStName("�̸���");
		�̸���.setStDept("��ǻ�Ͱ���");
		�̸���.setStGrade(3);
		�̸���.setStTel("010-1111-1111");
		
		System.out.println(�̸���.toString());
	}
}
