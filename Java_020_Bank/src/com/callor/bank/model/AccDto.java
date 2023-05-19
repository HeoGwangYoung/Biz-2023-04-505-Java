package com.callor.bank.model;

public class AccDto {

/*
 * 계좌정보 데이터 클래스
 * 계좌번호 : acNum
 * 계좌구분 : acDiv
 * 고객ID	: acId
 * 최종잔액 : acBalance
 */

	public String acNum;
	public String acDiv;
	public String buId;
	public int acBalance;
	
	public AccDto(String acNum, String acDiv, String buId, int acBalance) {
		this.acNum = acNum;
		this.acDiv = acDiv;
		this.buId = buId;
		this.acBalance = acBalance;
	}
	public AccDto() {
	}
	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDiv=" + acDiv + ", buId=" + buId + ", acBalance=" + acBalance + "]";
	}
	
}
