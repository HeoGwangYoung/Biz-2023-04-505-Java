package com.callor.classes.exec;

public class ExecB {

	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51;
		/*
		 * ExecAŬ������ ���ǵ� prime() method���� rndNum ������ ���� �����ϰ� �Ҽ��ΰ��� �Ǻ��Ͽ� �� ����� return �޴´�
		 * 
		 * prime() method�� return �� ���� result ������ ����, �Ҵ�, ���� �Ѵ�
		 */
		int result = ExecA.prime(rndNum);
		if (result > 0) {
			System.out.println(rndNum + " �� �Ҽ�");
		} else {
			System.err.println(rndNum + " �� �Ҽ� �ƴ�");
		}
	}
}
