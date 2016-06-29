package com.kazoo.mybtn;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyFxButton extends Application{
	Button btn1;
	

	public static void main(String[] args) {
		launch(args);

	}
	
	public void start(Stage primaryStage)throws Exception{
		//set the stage
		primaryStage.setTitle("My Button");
		 btn1 = new Button();
		btn1.setText("Click Me");
		
		//create layout
		StackPane layout = new StackPane();
		//add objects to layout
		layout.getChildren().add(btn1);
		//add layout to the scene
		Scene scene = new Scene(layout, 300, 250);
		
		//add the scene to the stage
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
