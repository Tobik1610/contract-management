package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddView extends Dialog{
	
	private GridPane grid;
	private Text text;

	public AddView() {
		
		this.grid = new GridPane();
		this.text = new Text("Hallo");
		
		grid.add(text, 0, 0);
		
		
		final DialogPane dialogPane = getDialogPane();
		dialogPane.setContent(grid);
	}

	
//	public void show(Stage stage) {
//		stage.setResizable(true);
//		stage.setTitle(title);
//		stage.setScene(scene);
//		stage.setMaximized(true);
//		stage.show();
//	}

}
