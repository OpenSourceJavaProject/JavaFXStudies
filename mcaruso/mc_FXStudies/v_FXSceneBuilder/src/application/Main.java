package application;
	
import java.io.IOException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(); 
		InputStream in = Main.class.getResourceAsStream("../Sample.fxml");	
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(Main.class.getClassLoader().getResource("../Sample.fxml"));

		BorderPane root; 
		try {
			root = loader.load(in);

		}finally{
			in.close();
		}
		Scene scene = new Scene(root,800,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
