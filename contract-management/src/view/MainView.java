package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Model;
 
public class MainView{
 
	private Scene scene;
	private StackPane pane;
	private String title;
	private Button btn;

	public MainView() {
		this.pane = new StackPane();
		this.scene = new Scene(pane, 800, 600);
		this.btn = new Button();
		pane.getChildren().add(btn);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Button getBtn() {
		return btn;
	}
	
	public void setBtnTxt(String text) {
		btn.setText(text);
	}

	public void show(Stage stage) {
		stage.setResizable(true);
		stage.setTitle(title);
		stage.setScene(scene);
		stage.show();
		
	}
	

}

