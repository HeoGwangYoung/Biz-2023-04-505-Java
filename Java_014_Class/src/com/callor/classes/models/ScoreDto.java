package com.callor.classes.models;

public class ScoreDto {

	/*
	 * Dto(Data Transfer Object, �����͸� �������� �����ϱ� ����) Ŭ����
	 * 
	 * 1. Ŭ���� ������ ���������� private ���� ����
	 * 2. ���� ���� �а� ���� ���� setter, getter method ����
	 * 3. ���� ���� Ȯ���ϱ� ���� toString() method�� �� ����
	 */
	
	private String stNum;
	private int scKor;
	private int scMath;
	private int scMusic;
	private int scArt;
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	
	public int getScKor() {
		return scKor;
	}
	public void setScKor(int scKor) {
		this.scKor = scKor;
	}
	
	public int getScMath() {
		return scMath;
	}
	public void setScMath(int scMath) {
		this.scMath = scMath;
	}
	
	public int getScMusic() {
		return scMusic;
	}
	public void setScMusic(int scMusic) {
		this.scMusic = scMusic;
	}
	
	public int getScArt() {
		return scArt;
	}
	public void setScArt(int scArt) {
		this.scArt = scArt;
	}
	
	
	public int getTotal() {
		int total = this.scKor;
		total += this.scMath;
		total += this.scMusic;
		total += this.scArt;
		
		return total;
	}
	/*
	 * java�� ��� Ŭ������ �⺻������ toString() method�� �����ϰ��ִ�
	 * ������ �⺻ toString() �� �޸� �ּҸ� �����ִ� �ڵ尡 ����
	 * 
	 * Dto Ŭ���������� ������ ������ ���ڿ��� ��ȯ�Ͽ� return �ϴ� method�� ������(�ٽ� ����)�Ѵ�
	 * 
	 * @Override : Annotation Ű����
	 * @Override : ������ �����ϴ� method�� �ٽ� �����ϰڴ� ��� ���þ�
	 */
	
	@Override
	public String toString() {
		return "ScoreDto [stNum=" + stNum + ", scKor=" + scKor + ", scMath=" + scMath + ", scMusic=" + scMusic
				+ ", scArt=" + scArt + "]";
	}
}
