package controller;

import model.Model;
import view.MainView;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class MainVC{

	private MainView view; 
	private Model model; 
	     
	public MainVC( Model model){ 
		this.model = model; 
		this.view = new MainView();
		
		//Titel setzten
		view.setTitle(model.getTitle());
		
		//Button Text setzen
		view.setBtnTxt(model.getBtn1());
		
		//Button Funktion implementieren
		view.getBtn().setOnAction(new btnEventHandler());  
	}

	public void show() {
		view.show(model.getPrimaryStage());
		
	} 
}

class btnEventHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Button gedrückt");
		
	}

	
     
 }
