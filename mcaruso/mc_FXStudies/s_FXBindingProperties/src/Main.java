import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
/*
 * This demo will take an input in a text field.
 * As the text field is being filled in  a label will
 * be dynamically updated to display the text being typed into 
 * the text field
 */
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	Stage window;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Real Time Update");
		
		//input and label
		TextField userInput = new TextField();
		userInput.setMaxWidth(200);
		
		Label firstLabel = new Label("Welcome to the site ");
		Label secondLabel = new Label();
		
		HBox bottomText = new HBox(firstLabel, secondLabel);
		bottomText.setAlignment(Pos.CENTER);
		
		VBox layout = new VBox(10, userInput, bottomText);
		layout.setAlignment(Pos.CENTER);
		
		//bind input text to secondLabel
		secondLabel.textProperty().bind(userInput.textProperty());
		
		Scene scene = new Scene(layout, 500, 200);
		window.setScene(scene);
		window.show();
		
	}

}
