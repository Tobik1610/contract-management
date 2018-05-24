package controller;

import Main.Contract;
import model.Model;
import view.AddView;
import view.ChangeView;

public class ChangeVC {

	private ChangeView view; 
	private Model model; 
	private Contract selected;
	
	public ChangeVC(Model model) {
		this.model = model;
		this.view = new ChangeView();
		
		this.selected = model.getContracts().get(model.getSelectedContractIndex());
		
		//Bezeichnungen setzen
		view.setTitle(model.getAddViewTitle());
		view.getText1().setText(model.getAddViewText1());
		view.getText2().setText(model.getAddViewText2());
		view.getText3().setText(model.getAddViewText3());
		
		
		//Inhalt setzten
		view.getNameTextField().setText(selected.getName());
		view.getDescrTextField().setText(selected.getDescr());
		view.getDatePicker().setValue(selected.getEndDate());
	}
	
	public void show() {
		//Hinzufügen eines neuen Vertrags
		view.showAndWait().ifPresent(result -> {
			model.getContracts().remove(model.getSelectedContractIndex());
			model.getContracts().add(model.getSelectedContractIndex(), (Contract) result);
	    });
	} 
}
