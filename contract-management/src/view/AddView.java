package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddView {
	
	private Scene scene;
	private GridPane pane;
	private String title;
	
	public AddView() {
		pane = new GridPane();
		pane.setAlignment(Pos.BASELINE_LEFT);
		pane.setVgap(4);
		pane.setPadding(new Insets(2, 2, 2, 2));
		scene = new Scene(pane, 800, 600);
	}
	
	public void show(Stage stage) {
		stage.setResizable(true);
		stage.setTitle(title);
		stage.setScene(scene);
		stage.setMaximized(true);
		stage.show();
	}

}
