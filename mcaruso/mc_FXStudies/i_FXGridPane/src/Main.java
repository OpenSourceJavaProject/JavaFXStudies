import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage window;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("GridPane Sample");
		
		GridPane grid = new GridPane(); 
		//padding between window and grid
		grid.setPadding(new Insets(10));
		//padding in between cells 
		grid.setVgap(8);
		grid.setHgap(10);
		
		Label titleLabel = new Label("Log In Form");
		GridPane.setConstraints(titleLabel, 1, 0);
		Label userLabel = new Label("User:");
		GridPane.setConstraints(userLabel, 0, 1);
		TextField userText = new TextField("Bobby");
		GridPane.setConstraints(userText, 1, 1);
		
	
		
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0, 2);
		TextField passText = new TextField();
		passText.setPromptText("Enter Password");
		GridPane.setConstraints(passText, 1, 2);
		
		Button login = new Button("Log in");
		GridPane.setConstraints(login, 1, 3);
		
		grid.getChildren().addAll(titleLabel, userLabel, userText, passLabel,
				passText, login);
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene);
		window.show(); 
	
	
	
	
	}

}// EndofClass
