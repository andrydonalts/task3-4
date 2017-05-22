package com.andry.task3;

import com.andry.task3.controller.Controller;
import com.andry.task3.model.Model;
import com.andry.task3.view.View;

public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		controller.processUser();
	}

}
