package view;
import controller.Controller;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Model;
 
public class AppView{
 
	private Model model;

	public AppView(Stage primaryStage) {
		//Beziehen des Models
		model = new Model();
		
		// Titel des Fensters
		primaryStage.setTitle(model.getTitle());
		Button btn = new Button();
		btn.setOnAction(new Controller(this));
		
		// Erstellen der Hauptseite
		StackPane root = new StackPane();
		Scene mainScene = new Scene(root, 800, 600);
		root.getChildren().add(btn);
		
		// Setzten der Startseite
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	

}

