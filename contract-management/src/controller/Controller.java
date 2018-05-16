package controller;

import model.Model;
import view.AppView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller implements EventHandler<ActionEvent>{

	private AppView view; 
	private Model model; 
	     
	public Controller(AppView view){ 
		this.view = view; 
		this.model = new Model(); 
	}

	@Override
	public void handle(ActionEvent arg0) {
		System.out.println("Button gedrückt");
		
	} 
}
