package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ClassD {

	public static void main(String[] args) {

		/*
		 * �迭 �ټ��� �����͸� ���ӵ� ������ �����ϴ� ���� ���� : �ѹ� ũ��(��Ұ���)�� �������� �ڵ尡 ����Ǵ� �߰����� ũ��(��Ұ���)��
		 * ������ �� ����
		 * 
		 * ������ �������� ������ ����Ǿ�� �ϴ� ��찡 ���� Java ������ �迭�� ������ �ڵ尡 ����Ǵ� ���߿� �����Ӱ� ������ �� �ֵ���
		 * List ��� �÷��� ������ �����ϰ� �ִ�
		 * 
		 */
		int[] nums = new int[10];
		/*
		 * ��ü���⿡�� Ŭ������ ���(implements) List<> Ŭ������ ArrayList, LinkedList, Vector Ŭ������
		 * �θ��̴� ArrayList, LinkedList, Vector Ŭ������ List Ŭ������ ��� �޾Ҵ�
		 */
		List<Integer> numList = new ArrayList<>();
		numList = new LinkedList<>();
		numList = new Vector<>();

		ArrayList<Integer> arrList = new ArrayList<>();
		LinkedList<Integer> linkList = new LinkedList<>();
		Vector<Integer> vecList = new Vector<>();

		String str = new String();
	}
}
