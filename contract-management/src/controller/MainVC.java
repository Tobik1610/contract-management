package controller;

import model.Model;
import view.MainView;
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
		view.setBtn2Txt(model.getBtn2());
		
		//Button Funktion implementieren
		view.getBtn1().setOnAction(new btn1EventHandler());  
		view.getBtn2().setOnAction(new btn2EventHandler()); 
		
		view.getBtn2().setDisable(true);
	}

	public void show() {
		view.show(model.getPrimaryStage());
	} 


	class btn1EventHandler implements EventHandler<ActionEvent>{
	
		@Override
		public void handle(ActionEvent event) {
			//Speichern der derzeitigen Fenstergröße
			double x = model.getPrimaryStage().getWidth();
			double y = model.getPrimaryStage().getHeight();
			//Wechseln auf Fenstergröße welche im Model gespeichert ist
			view.setSceneSize(model.getPrimaryStage(), model.getWidth(), model.getHeigth());
			//Alte Fenstergröße ins Model schreiben
			model.setWidth(x);
			model.setHeigth(y);
			//Den jeweils anderen Button disablen
			view.getBtn1().setDisable(true);
			view.getBtn2().setDisable(false);
		}
	}
	
	class btn2EventHandler implements EventHandler<ActionEvent>{
		
		@Override
		public void handle(ActionEvent event) {
			//Speichern der derzeitigen Fenstergröße
			double x = model.getPrimaryStage().getWidth();
			double y = model.getPrimaryStage().getHeight();
			//Wechseln auf Fenstergröße welche im Model gespeichert ist
			view.setSceneSize(model.getPrimaryStage(), model.getWidth(), model.getHeigth());
			//Alte Fenstergröße ins Model schreiben
			model.setWidth(x);
			model.setHeigth(y);
			//Den jeweils anderen Button disablen
			view.getBtn1().setDisable(false);
			view.getBtn2().setDisable(true);
		}
	}
     
 }
