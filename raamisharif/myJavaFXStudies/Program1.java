import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Program1 extends Application{
	Button button;
	Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		primaryStage.setTitle("My First JavaFX Program");
		
		primaryStage.setOnCloseRequest(e -> { 
			e.consume();
			closeProgram();
		});
		
		button = new Button();
		button.setText("Click Me!");
		button.setOnAction(e -> AlertBox.display("An Alert", "You Said: " + Confirmbox.display("Confirm Box", "Would you like to send the message?")));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void closeProgram(){
		if(Confirmbox.display("Close Program" , "Are you sure you want to exit?"))
			window.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	

}
