package com.andry.task3.view;

import com.andry.task3.model.util.Util;

public class View {
	
	public static String COMMA_WITH_SPACE = ", ";
	public static String SPACE = " ";
	public static String DOT = ".";
	public static String NEW_LINE = "\n";
	
	public static String FLAT = "flat, ";
	public static String CREATED_DATE = "Created date: ";
	public static String EDIT_DATE = "Edit date: ";

	public static String INPUT_SURNAME = "Enter surname ";
	public static String INPUT_NAME = "Enter name ";
	public static String INPUT_PATRONYMIC = "Enter patronymic ";
	public static String INPUT_NICK = "Enter nick";
	public static String INPUT_COMMENT = "Enter comment";
	public static String INPUT_GROUP = "Select group: " + Util.getGroupOptions();
	public static String INPUT_HOME_PHONE_NUMBER = "Enter home phone number ";
	public static String INPUT_MOBILE_NUMBER = "Enter mobile number ";
	public static String INPUT_MOBILE_NUMBER_ADDITIONAL = "Enter second mobile number ";
	public static String INPUT_EMAIL = "Enter email ";
	public static String INPUT_SKYPE = "Enter skype ";
	public static String INPUT_INDEX = "Enter index";
	public static String INPUT_CITY = "Enter city ";
	public static String INPUT_STREET = "Enter street ";
	public static String INPUT_HOUSE = "Enter number of house ";
	public static String INPUT_FLAT_NUMBER = "Enter number of flat ";
	
	public static String ENTER_NEW_NICK = "Enter new nick";
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static void printErrorMessage() {
		System.out.println("Wrong input data");
	}
	
	public static String getNickOverlapMessage(String nick) {
		return "Nick \"" + nick + "\" already exists";
	}
}
