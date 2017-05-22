package com.andry.task3.controller.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExValidator {

	public static String REGEX_NAME = "^[A-Z][a-z]{1,15}$";
	public static String REGEX_NICK = "^[A-Za-z0-9_-]{2,16}$";
	public static String REGEX_COMMENT = "^[\\W\\w\\s]{1,100}$";
	public static String REGEX_PHONE = "^[0][1-9][0-9]{8}$";
	public static String REGEX_PHONE_ADDITIONAL = "(^$)|^([0][1-9][0-9]{8})$";
	public static String REGEX_INDEX = "^[0-9]{5}$";
	public static String REGEX_STREET_AND_CITY = "^[A-Z][a-z-\\s]{2,30}$";
	public static String REGEX_HOUSE_NUMBER = "^[1-9][0-9]?[0-9]?([A-Z]?|[a-z]?)$";
	public static String REGEX_FLAT_NUMBER = "^[1-9][0-9]{0,2}$";
	public static String REGEX_EMAIL = "^[\\w-]+[@][\\w-\\.]+$";
	
	public static boolean checkDataWithRegex(String data, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(data);
		return matcher.matches();
	}
}
