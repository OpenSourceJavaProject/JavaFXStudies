package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	static Stage window;
	static String username;

	@Override
	public void start(Stage primaryStage) {
		try {
			
			username = UserNameInput.display();
			
			Parent root = FXMLLoader.load(getClass().getResource("/MyScene.fxml"));
			primaryStage.setTitle("Scene Builder tutorial");
			primaryStage.setScene(new Scene(root));
			window = primaryStage;
			
			window.setOnCloseRequest(e -> {
				SampleController.closeStreams();
			});
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Stage getWindow(){
		return window;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
