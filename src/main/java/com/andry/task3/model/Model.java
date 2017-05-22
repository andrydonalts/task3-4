package com.andry.task3.model;

import java.util.ArrayList;
import java.util.List;

import com.andry.task3.model.entity.Note;

public class Model {
	List<Note> notebook;
	
	public Model() {
		notebook = new ArrayList<Note>();
	}
	
	public void addNoteToNotebook(Note note) {
		notebook.add(note);
	}
	
	public List<Note> getNotebook() {
		return notebook;
	}
}
