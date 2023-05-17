package com.callor.bank.model;

public class AccDto {

/*
 * 계좌정보 데이터 클래스
 * 
 * 고객ID		문자열(10)  buId
 * 계좌번호		문자열(10)	acNum
 * 거래일자		문자열		acDiv
 * 거래구분		문자열		acInput
 * 입금			문자열		acOutput
 * 출금			문자열		acDate
 * 거래시각		문자열		acTime
 */

	public String buId;
	public String acNum;
	public String acDiv;
	public int acInput;
	public int acOutput;
	public String acDate;
	public String acTime;
	
	public AccDto(String buId, String acNum, String acDiv, int acInput, int acOutput, String acDate, String acTime) {
		this.buId = buId;
		this.acNum = acNum;
		this.acDiv = acDiv;
		this.acInput = acInput;
		this.acOutput = acOutput;
		this.acDate = acDate;
		this.acTime = acTime;
	}
	
	public AccDto() {
		
	}
	
	@Override
	public String toString() {
		return "AccDto [buId=" + buId + ", acNum=" + acNum + ", acDiv=" + acDiv + ", acInput=" + acInput + ", acOutput="
				+ acOutput + ", acDate=" + acDate + ", acTime=" + acTime + "]";
	}

	

}
