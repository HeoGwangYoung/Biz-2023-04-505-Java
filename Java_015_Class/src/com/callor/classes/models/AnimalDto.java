package com.callor.classes.models;

public class AnimalDto {

	private String anName;
	private String anKind;
	private int anage;
	
	public AnimalDto() {
		super();
	}

	public AnimalDto(String anName, String anKind, int anage) {
		super();
		this.anName = anName;
		this.anKind = anKind;
		this.anage = anage;
	}

	public String getAnName() {
		return anName;
	}
	public void setAnName(String anName) {
		this.anName = anName;
	}

	public String getAnKind() {
		return anKind;
	}
	public void setAnKind(String anKind) {
		this.anKind = anKind;
	}

	public int getAnage() {
		return anage;
	}
	public void setAnage(int anage) {
		this.anage = anage;
	}

	@Override
	public String toString() {
		return "AnimalDto [anName=" + anName + ", anKind=" + anKind + ", anage=" + anage + "]";
	}
}
