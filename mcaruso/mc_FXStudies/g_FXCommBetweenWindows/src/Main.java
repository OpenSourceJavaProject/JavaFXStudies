import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	Stage window;
	Button btn; 
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Main Window");
		
		btn = new Button("Close Program");

		
		
		StackPane layout = new StackPane(); 
		layout.getChildren().add(btn);
		
		Scene scene = new Scene(layout, 300, 200);
		
		window.setScene(scene);
		window.show();
		
		
	}

}
