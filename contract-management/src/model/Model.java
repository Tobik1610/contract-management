package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.Serializable;

import Main.Contract;
import Main.Main;

public class Model implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Data
	private Stage primaryStage = null;
	private ObservableList<Contract> contracts =FXCollections.observableArrayList();
	private int selectedContractIndex;
	private double width = 725;
	private double heigth = 470;
	
	//App
	private String title = "Vertragsverwaltung";
	
	//Main View
	private String message = "Button pressed";
	private String btnAdd = "Neuer Vertrag";
	private String btnChange = "Ändern";
	private String btnDelete = "Löschen";
	private Image btnSettingIcon = new Image(Model.class.getResourceAsStream("SettingsIcon.png"), 40, 40, false, false);
	
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

	public String getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(String btnAdd) {
		this.btnAdd = btnAdd;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
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

	public String getBtnChange() {
		return btnChange;
	}

	public void setBtnChange(String btnChange) {
		this.btnChange = btnChange;
	}

	public String getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(String btnDelete) {
		this.btnDelete = btnDelete;
	}

	public int getSelectedContractIndex() {
		return selectedContractIndex;
	}

	public void setSelectedContractIndex(int selectedContractIndex) {
		this.selectedContractIndex = selectedContractIndex;
	}

	public Image getBtnSettingIcon() {
		return btnSettingIcon;
	}

	public void setBtnSettingIcon(Image btnSettingIcon) {
		this.btnSettingIcon = btnSettingIcon;
	}
}
