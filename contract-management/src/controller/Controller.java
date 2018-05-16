package controller;

import model.Model;
import view.AppView;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class Controller implements EventHandler<Event>{

	private AppView view; 
	private Model model; 
	     
	public Controller(AppView view, Model model){ 
		this.view = view; 
		this.model = model; 
	}

	@Override
	public void handle(Event event) {
		System.out.println(model.getMessage());
		
		
	} 
}
