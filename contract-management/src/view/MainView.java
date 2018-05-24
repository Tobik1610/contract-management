package view;

import java.time.LocalDate;

import javax.swing.text.TabableView;

import Main.Contract;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class MainView{
 
	private Scene scene;
	private GridPane pane;
	private String title;
	private Button btnAdd, btnDelete, btnChange, btnSettings;
	private HBox hBtnBox, hSettingBox;
	private TableView<Contract> tView;

	public MainView() {
		pane = new GridPane();
		pane.setAlignment(Pos.BASELINE_LEFT);
		pane.setVgap(4);
		pane.setHgap(10);
		pane.setPadding(new Insets(2, 2, 2, 2));
		scene = new Scene(pane);
		
		//Buttons
		btnAdd = new Button();
		btnDelete = new Button();
		btnChange = new Button();
		btnSettings = new Button();
		
		//Buttongruppe
		hBtnBox = new HBox(10);
		hBtnBox.setAlignment(Pos.TOP_LEFT);
		hBtnBox.getChildren().addAll(btnAdd, btnChange, btnDelete);
		pane.add(hBtnBox, 0, 1);
		
		//Einstellungen
		hSettingBox = new HBox(1);
		hSettingBox.setAlignment(Pos.TOP_RIGHT);
		hSettingBox.getChildren().add(btnSettings);
//		pane.add(hSettingBox, 0, 1);
		
		//List View
		tView = new TableView<>();
		//Tabellenspalten
		TableColumn<Contract, String> nameCol = new TableColumn<Contract, String>("Vertrag");
		nameCol.setCellValueFactory(new PropertyValueFactory<Contract, String>("name"));
		nameCol.setMinWidth(200);
		
        TableColumn<Contract, String> descrCol = new TableColumn<Contract, String>("Beschreibung");
        descrCol.setCellValueFactory(new PropertyValueFactory<Contract, String>("descr"));
        descrCol.setMinWidth(400);
        
        TableColumn<Contract, LocalDate> dateCol = new TableColumn<Contract, LocalDate>("Enddatum");
        dateCol.setCellValueFactory(new PropertyValueFactory<Contract, LocalDate>("endDate"));
        dateCol.setMinWidth(100);
        
        tView.getColumns().addAll(nameCol, descrCol, dateCol);
		pane.add(tView, 0, 0);
		
	}
	
	public TableView<Contract> gettView() {
		return tView;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSceneSize(Stage stage, double x, double y) {
		stage.setHeight(y);
		stage.setWidth(x);
	}
	
	public Button getBtnAdd() {
		return btnAdd;
	}
	
	public void setBtnAddTxt(String text) {
		btnAdd.setText(text);
	}
	
	public Button getBtnChange() {
		return btnChange;
	}
	
	public void setBtnChangeTxt(String text) {
		btnChange.setText(text);
	}
	
	public Button getBtnDelete() {
		return btnDelete;
	}
	
	public void setBtnDeleteTxt(String text) {
		btnDelete.setText(text);
	}

	public void show(Stage stage) {
		stage.setResizable(true);
		stage.setTitle(title);
		stage.setScene(scene);
		stage.show();
		
	}

	public Labeled getBtnSetting() {
		return btnSettings;
	}
	

}

