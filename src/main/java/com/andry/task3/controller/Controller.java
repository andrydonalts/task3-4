package com.andry.task3.controller;

import java.util.List;

import com.andry.task3.controller.util.InputDataController;
import com.andry.task3.exceptions.LoginAlreadyExistsException;
import com.andry.task3.model.Model;
import com.andry.task3.model.entity.Note;
import com.andry.task3.view.View;

public class Controller {
	Model model = new Model();
	View view = new View();
	InputDataController inputDataController;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void processUser() {
		createDefaultUsers();
		inputDataController = new InputDataController();
		Note note = inputDataController.createNote();
		View.printMessage(note.toString());
		checkNickOverlap(note);
		model.addNoteToNotebook(note);
		View.printMessage(Integer.toString((model.getNotebook().size())));
	}
	
	public void checkNickOverlap(Note note) {
		try {
			inputDataController.checkNicknameOverlap(note, model.getNotebook());
		} catch (LoginAlreadyExistsException e) {
			e.printStackTrace();
			Note newNote = inputDataController.changeNickname(note);
			checkNickOverlap(newNote);
		}
	}
	
	public void createDefaultUsers() {
		List<Note> notes = model.getNotebook();
		notes.add(InputDataController.createDefaultUserJustWithNickname("Andrey"));
		notes.add(InputDataController.createDefaultUserJustWithNickname("Vova"));
		notes.add(InputDataController.createDefaultUserJustWithNickname("Dima"));
	}
	
}
