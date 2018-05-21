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
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class MainView{
 
	private Scene scene;
	private GridPane pane;
	private String title;
	private Button btn1;
	private Button btn2;
	private VBox vBox;
	private TableView<Contract> tView;

	public MainView() {
		pane = new GridPane();
		pane.setAlignment(Pos.BASELINE_LEFT);
		pane.setVgap(4);
		pane.setPadding(new Insets(2, 2, 2, 2));
		scene = new Scene(pane, 800, 600);
		btn1 = new Button();
		
		//Buttongruppe
		vBox = new VBox(10);
		vBox.setAlignment(Pos.TOP_CENTER);
		vBox.getChildren().add(btn1);
		pane.add(vBox, 0, 0);
		
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
		pane.add(tView, 1, 0);
		
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
	
	public Button getBtn1() {
		return btn1;
	}
	
	public void setBtn1Txt(String text) {
		btn1.setText(text);
	}
	
	public Button getBtn2() {
		return btn2;
	}
	
	public void setBtn2Txt(String text) {
		btn2.setText(text);
	}

	public void show(Stage stage) {
		stage.setResizable(true);
		stage.setTitle(title);
		stage.setScene(scene);
		stage.setMaximized(true);
		stage.show();
		
	}
	

}

