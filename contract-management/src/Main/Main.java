package Main;

import controller.MainVC;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Model;

public class Main extends Application{

	private Model model;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Model initialisieren
		this.model = new Model(primaryStage); 
		
		//Reader initialisieren
		new Reader(model);
		
		//Ersten Controller aufrufen
		MainVC mainVC = new MainVC(model);
		mainVC.show();
	}
	
	@Override
	public void stop() throws Exception {

		//Writer initialisieren
		new Writer(model);
		
		super.stop();
	}

}
