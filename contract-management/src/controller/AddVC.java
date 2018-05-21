package controller;

import model.Model;
import view.AddView;

public class AddVC {

	private AddView view; 
	private Model model; 
	
	public AddVC(Model model) {
		this.model = model;
		this.view = new AddView();
	}
	
	public void show() {
		view.show(model.getPrimaryStage());
	} 
}
