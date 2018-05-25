package controller;

import model.Model;
import view.MainView;

import java.time.LocalDate;

import Main.Contract;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainVC{

	private MainView view; 
	private Model model; 
	
	     
	public MainVC( Model model){ 
		this.model = model; 
		this.view = new MainView();
		
		//Titel und Größe setzten
		view.setTitle(model.getTitle());
//		view.setSceneSize(model.getPrimaryStage(), model.getWidth(), model.getHeigth());
		
		//Button Text setzen
		view.setBtnAddTxt(model.getBtnAdd());
		view.setBtnChangeTxt(model.getBtnChange());
		view.setBtnDeleteTxt(model.getBtnDelete());
		
		//Button Icon setzen
//		view.getBtnSetting().setMaxSize(20, 20);
//		view.getBtnSetting().setGraphic(new ImageView(model.getBtnSettingIcon()));
		
		//Button Funktion implementieren
		view.getBtnAdd().setOnAction(new btnAddEventHandler());  
		view.getBtnChange().setOnAction(new btnChangeEventHandler()); 
		view.getBtnDelete().setOnAction(new btnDeleteEventHandler()); 
		
		//lView initialisieren
		view.gettView().setItems(model.getContracts());
	}

	public void show() {
		view.show(model.getPrimaryStage());
	} 


	class btnAddEventHandler implements EventHandler<ActionEvent>{
	
		@Override
		public void handle(ActionEvent event) {
			new AddVC(model).show();
		}
	}
	
	class btnChangeEventHandler implements EventHandler<ActionEvent>{
		
		@Override
		public void handle(ActionEvent event) {
			if(view.gettView().getSelectionModel().getSelectedItem() != null) {
				model.setSelectedContractIndex(view.gettView().getSelectionModel().getSelectedIndex());
				new ChangeVC(model).show();
			}
		}
	}
	
	class btnDeleteEventHandler implements EventHandler<ActionEvent>{
		
		@Override
		public void handle(ActionEvent event) {
			if(view.gettView().getSelectionModel().getSelectedItem() != null)
				model.getContracts().remove(view.gettView().getSelectionModel().getSelectedIndex());
		}
	}
	
     
 }
