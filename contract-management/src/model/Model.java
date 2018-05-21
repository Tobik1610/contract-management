package model;

import java.util.ArrayList;

import javafx.stage.Stage;
import Main.Contract;

public class Model {
	private Stage primaryStage = null;
	private String title = "Vertragsverwaltung";
	private double width = 1200;
	private double heigth = 600;
	
	private ArrayList<Contract> contracts;
	private String message = "Button pressed";
	private String btn1 = "Press Me!";
	private String btn2 = "Press Me Too!";
	
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

	public ArrayList<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(ArrayList<Contract> contracts) {
		this.contracts = contracts;
	}
}
