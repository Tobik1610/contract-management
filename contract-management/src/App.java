import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class App extends Application{
 
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Titel des Fensters
		primaryStage.setTitle("My First Java FX App");

		// Erstellen der zweiten Seite
		StackPane next = new StackPane();
		Scene nextScene = new Scene(next, 800, 600);
		Text nextText = new Text("Next Scene");
		next.getChildren().add(nextText);
    
		// Erstellen der Hauptseite
		Button btn = new Button("Change Scene");
		btn.setOnAction((e) -> primaryStage.setScene(nextScene));
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene mainScene = new Scene(root, 800, 600);
   
		// Setzten der Startseite
		primaryStage.setScene(mainScene);
		primaryStage.show();
		
		//Hallo Welt
	}

}

