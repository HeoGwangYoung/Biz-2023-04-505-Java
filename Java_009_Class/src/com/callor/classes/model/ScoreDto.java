package com.callor.classes.model;
/*
 * DB, �ٷ��� �����͸� ����ó������ Ȱ���ϱ� ���� ������� �𵨸� ����� �ִ�
 * �ʿ��� �������� �ʼ� �Ӽ����� �����ϴ� �߻�ȭ�� �ǽ�
 * �߻�ȭ�� �����͸� ���� û��ó������ ����ϱ� ���� Ŭ������ ������ �ϴ� ��
 * 
 * Ŭ���� �߿��� �����Ϳ� ������ ������ �ִ� Ŭ������ Java������ model Class �Ǵ� data Class ��� �Ѵ�
 * �̷��� Ŭ������ ...model package �� �����ϰ� Ŭ������ �����Ѵ�
 * 
 * ����ó���� �ϱ� ���Ͽ� model Class�� ���� �й�, �̸�, ����, ����, ���� ������ ������ ������ ����
 * ����, ��� ����Ͽ� return �ϴ� method�� ����
 */
public class ScoreDto {

	public String stNum;
	public String stName;
	
	public int scKor;
	public int scEng;
	public int scMath;
	/*
	 * this.����
	 * ���� Ŭ������ ����� ������ ����Ų��
	 * 
	 * this : Ŭ������ ��ü������ �����ϸ� ��ü���� ��ü�� ����Ű�� Ű����
	 */
	public int getTotal() {
		int total = this.scKor;
		total += this.scEng;
		total += this.scMath;
		return total;
	}
	
	public float getAvg() {
		float Avg = (float)this.getTotal() / 3;
		return Avg;
	}
}
