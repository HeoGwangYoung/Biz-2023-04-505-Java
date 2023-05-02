package com.callor.score.model;

/*
 * ���� ó���� �����ϴµ� �ʿ���
 * �й�(230001, ����, ����, ����, ����, �̼� �������� ������ �����ϰ� ����, ����� ����ϴ� method�� ����
 */

public class ScoreDto {
	// �� ��ü�� �����͸� ������ ������ �����ϱ�
	public String stNum;
	public int scKor;
	public int scEng;
	public int scMath;
	public int scMusic;
	public int scArt;
	
	// ������ ��հ���� ���� method ����
	
	// �л��� ������ ������ �����ϰ� getTotal() method�� ȣ���ϸ� ���������� ����Ͽ� return �ϴ� ����
	/*
	 * this keyword
	 * (data)Ŭ������ ��ü�� ���������� ��ü�� ���Ե� �Ӽ����� ��Ȯ�� �ϱ� ���� keyword
	 */
	public int getTotal() {
		int total = this.scKor;
		total += this.scEng;
		total += this.scMath;
		total += this.scMusic;
		total += this.scArt;
		
		return total;
	}
	
	/*
	 * Ŭ������ ����� getTotal() method�� ȣ���Ͽ� ������ ����ϵ��� �ϰ�, 
	 * ���� ������ float�� ��ȯ�Ͽ� ����� ����ϰ� �װ���� return
	 */
	public float getAvg() {
		float avg = (float)this.getTotal() / 5;
		
		return avg;
	}
}
