package com.callor.classes.exec;

import com.callor.classes.module.MyClassB;

public class ExecF {
	
	public static void main(String[] args) {
		/*
		 * (�츮��) ������ MyClassB Ŭ������ ������ �����ϴ� Ű���尡 �Ǿ���
		 * Java���� �⺻������ �����ϴ� Ű���� �ܿ� �����ڰ� ������ Ŭ������ ������ �����ϴ� Ű���尡 �ȴ�
		 */
		MyClassB myB = new MyClassB();
		System.out.println(myB.add(30, 40));
		System.out.println(myB.add(30.0f, 40.0f));
		System.out.println(myB.add("����", "�α�"));
	}
}
