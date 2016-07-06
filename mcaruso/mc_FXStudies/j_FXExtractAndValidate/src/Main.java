import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	Stage window;
	Scene scene;
	Button btn; 
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		window.setTitle("Getting Input");
		
		TextField nameInput = new TextField(); 
		btn = new Button("Click Here");
		btn.setOnAction( e -> isInt(nameInput, nameInput.getText()));
		
		VBox layout = new VBox(); 
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(nameInput, btn);
		
		scene = new Scene(layout, 300, 200);
		
		window.setScene(scene);
		window.show();
	}
	
	// sample validation method
	private boolean isInt( TextField input, String message){
		
		try{
			int age = Integer.parseInt(input.getText());
			System.out.println("Users age is: " + age);
			return true; 
		}catch(NumberFormatException e){
			System.out.println("Error: " + message + " is not a number");
			return false;
		}
		
		
	}
	
	

}//EndOfMain
