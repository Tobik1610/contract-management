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

public class ChangeView extends Dialog<Contract>{
	
	private GridPane grid;
	private Text text1, text2, text3;
	private TextField nameTextField;
	private DatePicker datePicker;
	private TextArea descrTextArea;
	
	public ChangeView() {
		// Erstellen der Controls
		this.grid = new GridPane();
		this.text1 = new Text();
		this.nameTextField = new TextField();
		this.text2 = new Text();
		this.descrTextArea = new TextArea();
		this.text3 = new Text();
		this.datePicker = new DatePicker();
		
		//Hinzuf�gen der Controls zum Grid
		grid.add(text1, 0, 0);
		grid.add(nameTextField, 0, 1);
		grid.add(text2, 0, 2);
		grid.add(descrTextArea, 0, 3);
		grid.add(text3, 0, 4);
		grid.add(datePicker, 0, 5);
		
		// Holen des DialogPanes
		final DialogPane dialogPane = getDialogPane();
		dialogPane.setContent(grid);
		dialogPane.getButtonTypes().addAll(ButtonType.CANCEL, ButtonType.OK);
		
		//Holen des OK Buttons
		Button okButton = (Button)dialogPane.lookupButton(ButtonType.OK);
		//Deaktivieren des OK Buttons bis eine g�ltige Eingabe getroffen wurde
		okButton.setDisable(true);
		// Es muss ein Name eingegeben werden
		nameTextField.textProperty().addListener((event, oldValue, newValue) 
                -> okButton.setDisable(newValue.trim().isEmpty()));
		
		// Parameter R�ckgabe wenn OK gedr�ckt wurde
		setResultConverter(button -> {
			ButtonData data = 
			        button == null ? null : ((ButtonType) button).getButtonData();
			    return data == ButtonData.OK_DONE 
			    		? new Contract(nameTextField.getText(), descrTextArea.getText(), datePicker.getValue())
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
	
	public TextField getNameTextField() {
		return this.nameTextField;
	}
	
	public TextArea getDescrTextField() {
		return this.descrTextArea;
	}
	
	public DatePicker getDatePicker() {
		return this.datePicker;
	}
}
