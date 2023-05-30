package com.callor.shop.models;

public class ProductDto {
	public String pCode;
	public String pName;
	public String pItem;
	public int pIPrice;
	public int pOPrice;
	
	
	public ProductDto() {
		super();
	}
	public ProductDto(String pCode, String pName, String pItem, int pIPrice, int pOPrice) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pItem = pItem;
		this.pIPrice = pIPrice;
		this.pOPrice = pOPrice;
	}
	
	@Override
	public String toString() {
		return "ProductDto [pCode=" + pCode + ", pName=" + pName + ", pItem=" + pItem + ", pIPrice=" + pIPrice
				+ ", pOPrice=" + pOPrice + "]";
	}

	
}
