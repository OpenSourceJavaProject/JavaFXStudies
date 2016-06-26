package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UserNameInput{
	
	private static String username;
	
	public static String display(){
		
		Stage window = new Stage();
		window.setTitle("User Name");
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinHeight(300);
		window.setMinWidth(400);
		
		Label lbl = new Label("Enter a UserName: ");
		TextField txtUser = new TextField();
		txtUser.setMaxWidth(200);
		
		
		Button submit = new Button("Log In");
		
		submit.setOnAction(e -> {
			username = txtUser.getText();
			window.close();
		});
		
		VBox layout = new VBox(3);
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(lbl, txtUser, submit);
		
		window.setScene(new Scene(layout));
		
		window.showAndWait();
		
		return username;
		
	}
	
	
}