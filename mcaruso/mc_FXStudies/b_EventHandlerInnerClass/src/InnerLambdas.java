package com.kazoo.innerLambdas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InnerLambdas extends Application{
		Button btn;
		
	public static void main(String[] args) {
		launch(args);

	}
	
	public void start(Stage primaryStage)throws Exception{
		primaryStage.setTitle("User Events");
		
		 btn = new Button();
		btn.setText("Click Me");
		//using and anonymous inner class to handle events
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				System.out.println("I'm an Inner class");
			}
		});
		
	
		
		StackPane layout = new StackPane();
		layout.getChildren().add(btn);
		
		Scene scene = new Scene(layout, 350, 350);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
