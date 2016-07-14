package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class SampleController implements Initializable{
	
	public Button button;
	public Label firstLabel; 
	public ToggleGroup toggle;
	
	//default no args constructor
	public SampleController(){
		
	}
	
	public void handleButtonClicks(){
		System.out.println("Running code from controller");
		button.setText("I've been clicked");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Loading user data");
		
	}
	
	

}
