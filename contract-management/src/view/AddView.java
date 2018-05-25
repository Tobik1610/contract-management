package view;

import Main.Contract;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class AddView extends Dialog<Contract>{
	
	private GridPane grid;
	private Text text1, text2, text3;
	private TextField textField1;
	private DatePicker datePicker;
	private TextArea textArea;
	
	public AddView() {
		// Erstellen der Controls
		this.grid = new GridPane();
		this.text1 = new Text();
		this.textField1 = new TextField();
		this.text2 = new Text();
		this.textArea = new TextArea();
		this.text3 = new Text();
		this.datePicker = new DatePicker();
		
		//Hinzufügen der Controls zum Grid
		grid.add(text1, 0, 0);
		grid.add(textField1, 0, 1);
		grid.add(text2, 0, 2);
		grid.add(textArea, 0, 3);
		grid.add(text3, 0, 4);
		grid.add(datePicker, 0, 5);
		
		// Holen des DialogPanes
		final DialogPane dialogPane = getDialogPane();
		dialogPane.setContent(grid);
		dialogPane.getButtonTypes().addAll(ButtonType.CANCEL, ButtonType.OK);
		
		//Holen des OK Buttons
		Button okButton = (Button)dialogPane.lookupButton(ButtonType.OK);
		//Deaktivieren des OK Buttons bis eine gültige Eingabe getroffen wurde
		okButton.setDisable(true);
		// Es muss ein Name eingegeben werden
		textField1.textProperty().addListener((event, oldValue, newValue) 
                -> okButton.setDisable(newValue.trim().isEmpty()));
		
		// Parameter Rückgabe wenn OK gedrückt wurde
		setResultConverter(button -> {
			ButtonData data = 
			        button == null ? null : ((ButtonType) button).getButtonData();
			    return data == ButtonData.OK_DONE 
			    		? new Contract(textField1.getText(), textArea.getText(), datePicker.getValue())
			    				: null;
		});
	}
	
	public Text getText1() {
		return this.text1;
	}
	
	public Text getText2() {
		return this.text2;
	}
	
	public Text getText3() {
		return this.text3;
	}
}
