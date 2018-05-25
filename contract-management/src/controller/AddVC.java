package controller;

import Main.Contract;
import model.Model;
import view.AddView;

public class AddVC {

	private AddView view; 
	private Model model; 
	
	public AddVC(Model model) {
		this.model = model;
		this.view = new AddView();
		
		//Bezeichnungen setzen
		view.setTitle(model.getAddViewTitle());
		view.getText1().setText(model.getAddViewText1());
		view.getText2().setText(model.getAddViewText2());
		view.getText3().setText(model.getAddViewText3());
	}
	
	public void show() {
		//Hinzufügen eines neuen Vertrags
		view.showAndWait().ifPresent(result -> {
	       model.getContracts().add((Contract) result);
	    });
	} 
}
