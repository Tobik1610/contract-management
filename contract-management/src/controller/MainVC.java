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
	}

	public void show() {
		view.show(model.getPrimaryStage());
	} 


	class btn1EventHandler implements EventHandler<ActionEvent>{
	
		@Override
		public void handle(ActionEvent event) {
			double x = model.getPrimaryStage().getWidth();
			double y = model.getPrimaryStage().getHeight();
			view.setSceneSize(model.getPrimaryStage(), model.getWidth(), model.getHeigth());
			model.setWidth(x);
			model.setHeigth(y);
		}
	}
	
	class btn2EventHandler implements EventHandler<ActionEvent>{
		
		@Override
		public void handle(ActionEvent event) {
			double x = model.getPrimaryStage().getWidth();
			double y = model.getPrimaryStage().getHeight();
			view.setSceneSize(model.getPrimaryStage(), model.getWidth(), model.getHeigth());
			model.setWidth(x);
			model.setHeigth(y);
		}
	}
     
 }
