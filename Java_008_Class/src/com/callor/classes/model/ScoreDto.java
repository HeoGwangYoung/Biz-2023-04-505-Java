package com.callor.classes.model;
/*
 * ����ó���� �Ҷ�, �л��̸�, �� ������ ������ �Ӽ����� �����ϴ� ������ ��ü�� �𵨸� ����
 * Dto Ŭ���� : ������ ��ü�� �𵨸��� java Ŭ����
 * 
 * �𵨸� �ܰ�
 * 
 * 1. �߻�ȭ �ܰ�
 * ����ó��(������⸦ ����Ͽ� ����ó���� �ϱ�)�� �����ϱ� ���Ͽ� �� �ʿ��� ������ ��Ұ� ������ ������?
 * 
 * 2. (Dto)Ŭ���� �𵨸�
 * �߻�ȭ �� �� ��Ҹ� Ŭ������ ����� ����
 * => Ŭ������ ������ �����ϱ�
 * 
 * 7���� ������ ������ ó���� ���̰�
 * ���⿡�� �й��� �л��̸��� ���ԵǾ�� �� ���̴�
 */
public class ScoreDto {
	// ����ó���� �ϴµ� �л��� ���� ��ҵ� �ʿ�
	public String stNum; // �й�
	public String stName; // �̸�
	
	// ����ó���� �ʿ��� 7�� ���� ��� ����(������ ����)
	public int intKor;
	public int intEng;
	public int intMth;
	public int intHis;
	public int intMus;
	public int intArt;
	public int intAth;
	
	public int getTotal() {
		int total = this.intKor + this.intEng + this.intMth + this.intHis + this.intMus + this.intArt + this.intAth;
		return total;
	}
	public float getAvg() {
		int total = this.getTotal();
		float avg = (float)total / 7;
		return avg;
	}
}
