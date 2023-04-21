package com.callor.controller;

public class ControllerF {
	/*
	 * method�� �ߺ� ����(Over loading)
	 * 1. ���� �̸��� method�� �ߺ��Ͽ� ������ �� �ִ�
	 * 2. method�� �̸��� ���ϼ��� ���� �ĺ����̴�
	 * 3. �׷����� �ұ��ϰ� Java������ method �̸��� �ߺ��� ����Ѵ�
	 * 
	 * method�� �ߺ��� ���Ǵ� ���
	 * 1. method�� parameter(�Ű�������) ������ ������ ������ type�� �ٸ����
	 * 2. method�� �Ű����� ������ �ٸ����
	 * 3. method�� �Ű����� type�� �������� �϶� ������ �ٸ����
	 * 
	 * �̰��� ���� ���(module) �����ڰ� �ƴ� �� ����� ����ϴ� �ٸ� �����ڿ��� ���� ���̴�
	 * �� ����� ����ϴ� �����ڴ� method�� ȣ���Ҷ� �����ϴ� ���� � type���� �����ؾ� �ϴ���
	 * ����� �� �� �� �ִ�
	 */
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int add(int num1, int num2 , int num3) {
		return num1 + num2 + num3;
	}
	
	public static float add(float num1, float num2) {
		return num1 + num2;
	}
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(10.0f, 20.0f));
		System.out.println(add(10.0, 20.0));
	}
}
