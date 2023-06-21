package com.bus.models;

public class TerLinkDto {
	public String depTerID;
	public String depTerNM;
	public String arrTerID;
	public String arrTerNM;
	
	@Override
	public String toString() {
		return "TerLinkDto [depTerID=" + depTerID + ", depTerNM=" + depTerNM + ", arrTerID=" + arrTerID + ", arrTerNM="
				+ arrTerNM + "]";
	}
}
