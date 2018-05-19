package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class MainView{
 
	private Scene scene;
	private StackPane pane;
	private String title;
	private Button btn1;
	private Button btn2;
	private HBox hbox;

	public MainView() {
		pane = new StackPane();
		scene = new Scene(pane, 800, 600);
		btn1 = new Button();
		btn2 = new Button();
		
		//Buttongruppe
		hbox = new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(btn1);
		hbox.getChildren().add(btn2);
		pane.getChildren().add(hbox);
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

