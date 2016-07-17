package application;

import javafx.scene.control.Button;

public class SampleController {
	
	public Button button;
	
	//default no args constructor
	public SampleController(){
		
	}
	
	public void handleButtonClicks(){
		System.out.println("Running code from controller");
		button.setText("I've been clicked");
	}
	
	

}
