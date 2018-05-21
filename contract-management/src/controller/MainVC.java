package controller;

import model.Model;
import view.MainView;

import java.time.LocalDate;

import Main.Contract;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
		view.setBtn1Txt(model.getBtn1());
		
		//Button Funktion implementieren
		view.getBtn1().setOnAction(new btn1EventHandler());  
		
		//lView initialisieren
		view.gettView().setItems(model.getContracts());
	}

	public void show() {
		view.show(model.getPrimaryStage());
	} 


	class btn1EventHandler implements EventHandler<ActionEvent>{
	
		@Override
		public void handle(ActionEvent event) {
			model.getContracts().add(new Contract("test", "Beschreibung", LocalDate.now()));
			view.gettView().refresh();
//			new AddVC(model).show();
			
		}
	}
	
     
 }
