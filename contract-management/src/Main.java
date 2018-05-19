
import controller.MainVC;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Model;
import view.*;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Model initialisieren
		Model model = new Model(primaryStage); 
		
		//Ersten Controller aufrufen
		MainVC mainVC = new MainVC(model);
		mainVC.show();
	}

}
