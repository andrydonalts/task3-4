package com.andry.task3.model.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.andry.task3.model.enums.Group;
import com.andry.task3.view.View;

public class Util {
	
	public static String formatDate(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		return dateFormat.format(date);
	}
	
	public static String getGroupOptions() {
		StringBuilder sb = new StringBuilder();
		Group[] groups = Group.values();
		for (Group group : groups) {
			sb.append(group);
			sb.append(View.SPACE);
		}
		return sb.toString();
	}
}
