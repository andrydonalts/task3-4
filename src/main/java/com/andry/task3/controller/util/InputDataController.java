package com.andry.task3.controller.util;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.andry.task3.exceptions.LoginAlreadyExistsException;
import com.andry.task3.model.entity.Adress;
import com.andry.task3.model.entity.Note;
import com.andry.task3.model.enums.Group;
import com.andry.task3.view.View;

public class InputDataController {
	
	Scanner scan;
	Note note;
	
	public InputDataController() {
		scan = new Scanner(System.in);
		note = new Note();
	}
	
	public Note createNote() {
		note = new Note();
		note.setSurname(getDataFromUser(View.INPUT_SURNAME, RegExValidator.REGEX_NAME));
		note.setName(getDataFromUser(View.INPUT_NAME, RegExValidator.REGEX_NAME));
		note.setPatronymic(getDataFromUser(View.INPUT_PATRONYMIC, RegExValidator.REGEX_NAME));
		note.setFullName();
		note.setNick(getDataFromUser(View.INPUT_NICK, RegExValidator.REGEX_NICK));
		note.setComment(getDataFromUser(View.INPUT_COMMENT, RegExValidator.REGEX_COMMENT));
		note.setGroup(getGroupFromUser());
		note.setHomePhoneNumber(getDataFromUser(View.INPUT_HOME_PHONE_NUMBER, RegExValidator.REGEX_PHONE));
		note.setMobileNumber(getDataFromUser(View.INPUT_MOBILE_NUMBER, RegExValidator.REGEX_PHONE));
		note.setMobileNumberAdditional(getDataFromUser(View.INPUT_MOBILE_NUMBER_ADDITIONAL, RegExValidator.REGEX_PHONE_ADDITIONAL));
		note.setEmail(getDataFromUser(View.INPUT_EMAIL, RegExValidator.REGEX_EMAIL));
		note.setSkype(getDataFromUser(View.INPUT_SKYPE, RegExValidator.REGEX_NICK));
		note.setAdress(createAdress());
		note.setAdressString();
		note.setCreatedDate(new Date());
		note.setLastEditDate(new Date());
		return note;
	}
	
	public static Note createDefaultUserJustWithNickname(String nick) {
		Note note = new Note();
		note.setNick(nick);
		return note;
	}
	
	public Adress createAdress() {
		Adress adress = new Adress();
		String stringIndex = getDataFromUser(View.INPUT_INDEX, RegExValidator.REGEX_INDEX);
		adress.setIndex(Integer.parseInt(stringIndex));
		adress.setCity(getDataFromUser(View.INPUT_CITY, RegExValidator.REGEX_STREET_AND_CITY));
		adress.setStreat(getDataFromUser(View.INPUT_STREET, RegExValidator.REGEX_STREET_AND_CITY));
		adress.setHouseNumber(getDataFromUser(View.INPUT_HOUSE, RegExValidator.REGEX_HOUSE_NUMBER));
		adress.setFlatNumber(getDataFromUser(View.INPUT_FLAT_NUMBER, RegExValidator.REGEX_FLAT_NUMBER));
		return adress;
	}
		
	public String getDataFromUser(String messageType, String regex) {
		View.printMessage(messageType);
		String data;
		while(true) {
			if (scan.hasNextLine()) {
				data = scan.nextLine();
				if (RegExValidator.checkDataWithRegex(data, regex)) {
					break;
				}
				View.printErrorMessage();
			}
		}
		return data;
	}
	
	public Group getGroupFromUser() {
		View.printMessage(View.INPUT_GROUP);
		while (true) {
			if (scan.hasNextLine()) {
				String userGroup = scan.nextLine();
				try {
					return Group.valueOf(userGroup);
				} catch (IllegalArgumentException ex) {
				}
			}
			View.printErrorMessage();	
		}
	}
	
	public void checkNicknameOverlap(Note newNote, List<Note> notes) throws LoginAlreadyExistsException {
		String newNick = newNote.getNick();
		for (Note note : notes) {
			if (note.getNick().equals(newNick)) {
				throw new LoginAlreadyExistsException(View.getNickOverlapMessage(newNick));
			}
		}
	}

	public Note changeNickname(Note note) {
		note.setNick(getDataFromUser(View.INPUT_NICK, RegExValidator.REGEX_NICK));
		return note;
	}
}
