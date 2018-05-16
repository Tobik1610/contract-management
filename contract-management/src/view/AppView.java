package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class AppView extends Application{
 
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Titel des Fensters
		primaryStage.setTitle("My First Java FX App");
    
		// Erstellen der Hauptseite
		StackPane root = new StackPane();
		Scene mainScene = new Scene(root, 800, 600);
   
		// Setzten der Startseite
		primaryStage.setScene(mainScene);
		primaryStage.show();
		
		//Hallo Welt
	}

}

