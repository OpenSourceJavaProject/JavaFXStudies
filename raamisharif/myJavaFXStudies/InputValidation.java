import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InputValidation extends Application {

	Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Input Validation Tutorial");
		TextField txtAge = new TextField();
		txtAge.setPromptText("Age");
		Button validate = new Button("Validate Age");
		validate.setOnAction(e -> {
			if(validate(txtAge)){
				System.out.println("Is Valid Age");
			}
			else{
				System.out.println("Invalid Age");
			}
		});
		
		
		VBox layout = new VBox(5);
		layout.getChildren().addAll(txtAge, validate);
		Scene sc = new Scene(layout);
		
		sc.getStylesheets().add("styles.css");
		window.setScene(sc);
		window.show();
	}
	
	private boolean validate(TextField txtBox){
		String content = txtBox.getText();
		int x;
		try{
			x = Integer.parseInt(content);
			if(x > 0){
				return true;
			}
			return false;
		}
		catch(NumberFormatException ex){
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}

}
