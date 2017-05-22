package com.andry.task3.model.entity;

import com.andry.task3.view.View;

public class Adress {
	private int index;
	private String city;
	private String streat;
	private String houseNumber;
	private String flatNumber;
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreat() {
		return streat;
	}
	
	public void setStreat(String streat) {
		this.streat = streat;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getFlatNumber() {
		return flatNumber;
	}
	

	public void setFlatNumber(String flat) {
		this.flatNumber = flat;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(index);
		sb.append(View.COMMA_WITH_SPACE);
		sb.append(city);
		sb.append(View.COMMA_WITH_SPACE);
		sb.append(streat);
		sb.append(View.SPACE);
		sb.append(houseNumber);
		sb.append(View.SPACE);
		sb.append(View.FLAT);
		sb.append(flatNumber);
		return sb.toString();
	}
	
	
}
