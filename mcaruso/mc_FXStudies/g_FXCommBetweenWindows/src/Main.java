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
		window.setTitle("Window 1");
		
		btn = new Button();
		btn.setText("Click Here");
		btn.setOnAction( e -> {
			boolean result = ConfirmBox.display("Confirm Box","Are you sure you want a Burger?");
			System.out.println("The result from Confirm Box is : " + result );
		});

		
		StackPane layout = new StackPane(); 
		layout.getChildren().add(btn);
		
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
	
	}

}
