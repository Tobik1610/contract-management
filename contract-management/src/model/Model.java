package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.io.Serializable;

import Main.Contract;

public class Model implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Data
	private Stage primaryStage = null;
	private ObservableList<Contract> contracts =FXCollections.observableArrayList();
	private double width = 1200;
	private double heigth = 600;
	
	//App
	private String title = "Vertragsverwaltung";
	
	//Main View
	private String message = "Button pressed";
	private String btn1 = "Neuer Vertrag";
	private String btn2 = "Press Me Too!";
	
	//Add View
	private String addViewTitle = "Neuer Vertrag";
	private String addViewText1 = "Vertragsname";
	private String addViewText2 = "Vertragsbeschreibung";
	private String addViewText3 = "Ablaufdatum";
	
	public Model(Stage primaryStage) {
		this.setPrimaryStage(primaryStage);
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBtn1() {
		return btn1;
	}

	public void setBtn1(String btn1) {
		this.btn1 = btn1;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public String getBtn2() {
		return btn2;
	}

	public void setBtn2(String btn2) {
		this.btn2 = btn2;
	}

	public ObservableList<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(ObservableList<Contract> contracts) {
		this.contracts = contracts;
	}

	public String getAddViewTitle() {
		return addViewTitle;
	}

	public void setAddViewTitle(String addViewTitle) {
		this.addViewTitle = addViewTitle;
	}

	public String getAddViewText1() {
		return addViewText1;
	}

	public void setAddViewText1(String addViewText1) {
		this.addViewText1 = addViewText1;
	}

	public String getAddViewText2() {
		return addViewText2;
	}

	public void setAddViewText2(String addViewText2) {
		this.addViewText2 = addViewText2;
	}

	public String getAddViewText3() {
		return addViewText3;
	}

	public void setAddViewText3(String addViewText3) {
		this.addViewText3 = addViewText3;
	}
}
