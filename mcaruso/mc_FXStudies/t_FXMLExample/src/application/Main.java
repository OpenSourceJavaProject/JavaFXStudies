package application;
	
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class Main extends Application {
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(); 
		InputStream in = Main.class.getResourceAsStream("/application/sample.fxml");
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(Main.class.getClassLoader().getResource("/application/sample.fxml"));
		
		VBox root;
		try{
			root = (VBox)loader.load(in);
		}finally{
			
		}
		
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
		public static void main(String[] args) {
		launch(args);
	}
		
}
