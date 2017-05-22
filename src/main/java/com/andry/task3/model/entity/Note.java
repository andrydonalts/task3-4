package com.andry.task3.model.entity;

import java.util.Date;

import com.andry.task3.model.enums.Group;
import com.andry.task3.model.util.Util;
import com.andry.task3.view.View;

public class Note {
	private String surname;
	private String name;
	private String patronymic;
	private String fullName;
	private String nick;
	private String comment;
	private Group group;
	private String homePhoneNumber;
	private String mobileNumber;
	private String mobileNumberAdditional;
	private String email;
	private String skype;
	private Adress adress;
	private String adressString;
	private Date createdDate;
	private Date lastEditDate;
		
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName() {
		StringBuilder sb = new StringBuilder(surname);
		sb.append(View.SPACE);
		sb.append(name.charAt(0));
		sb.append(View.DOT);
		this.fullName = sb.toString();
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getGroup() {
		return group.name();
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumberAdditional() {
		return mobileNumberAdditional;
	}
	public void setMobileNumberAdditional(String mobileNumberAdditional) {
		this.mobileNumberAdditional = mobileNumberAdditional;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkype() {
		return skype;
	}
	public void setSkype(String skype) {
		this.skype = skype;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public String getAdressString() {
		return adressString;
	}
	public void setAdressString() {
		this.adressString = adress.toString();
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastEditDate() {
		return lastEditDate;
	}
	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(fullName);
		sb.append(View.COMMA_WITH_SPACE);
		sb.append(nick);
		sb.append(View.NEW_LINE);
		sb.append(comment);
		sb.append(View.NEW_LINE);
		sb.append(group);
		sb.append(View.NEW_LINE);
		sb.append(homePhoneNumber);
		sb.append(View.COMMA_WITH_SPACE);
		sb.append(mobileNumber);
		if (mobileNumberAdditional != null) {
			sb.append(View.COMMA_WITH_SPACE);
			sb.append(mobileNumberAdditional);
		}
		sb.append(View.NEW_LINE);
		sb.append(email);
		sb.append(View.NEW_LINE);
		sb.append(skype);
		sb.append(View.NEW_LINE);
		sb.append(adressString);
		sb.append(View.NEW_LINE);
		sb.append(View.CREATED_DATE);
		sb.append(Util.formatDate(createdDate));
		sb.append(View.NEW_LINE);
		sb.append(View.EDIT_DATE);
		sb.append(Util.formatDate(lastEditDate));
		return sb.toString();
	}
	
	
	
}
