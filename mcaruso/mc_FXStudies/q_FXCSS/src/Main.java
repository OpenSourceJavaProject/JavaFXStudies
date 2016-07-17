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
		//add custom id from css file
		titleLabel.setId("boldLabel");
		GridPane.setConstraints(titleLabel, 1, 0);
		Label userLabel = new Label("User Name:");
//		userLabel.setStyle("-fx-text-fill: #ffffff;");
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
		
/*	login.setOnAction( e -> {
			setUserAgentStylesheet(STYLESHEET_CASPIAN);
		});
		*/

		
		//signup
		Button signup = new Button("Signup");
		GridPane.setConstraints(signup, 1 , 4);
		//adding custom style class
		signup.getStyleClass().add("button-blue");
		
		grid.getChildren().addAll(titleLabel, userLabel, userText, passLabel,
				passText, login, signup);
		
		Scene scene = new Scene(grid, 400, 350);
		
		//add stylesheet to the scene
		scene.getStylesheets().add(Main.class.getResource("viper.css").toExternalForm());
		window.setScene(scene);
		window.show(); 
	
	
	
	
	}

}// EndofClass
