package com.callor.score;

public class ScoreDto {
	// �л� ������ ���� �ν��Ͻ� ����
	String stNum;	//�й�
	int stKorSc;	//���� ����
	int stEngSc;	//���� ����
	int stMthSc;	//���� ����
	int stMusSc;	//���� ����
	int stArtSc;	//�̼� ����
	
	public int getStTotal() { //��ü �� ���� �ν��Ͻ��� ������ �������ִ� �޼���
		int result = 0;
		result += this.stKorSc;
		result += this.stEngSc;
		result += this.stMthSc;
		result += this.stMusSc;
		result += this.stArtSc;
		
		return result;
	}
	
	public float getStAvg() { // ��ü �� ���� �ν��Ͻ��� ����� �������ִ� �޼���
		float avg = (float)this.getStTotal() / 5;
		return avg;
	}
}
