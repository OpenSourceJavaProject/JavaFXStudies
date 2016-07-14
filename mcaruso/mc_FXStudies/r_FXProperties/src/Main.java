import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage window; 
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		window = primaryStage;
		window.setTitle("FX Properties Demo");
		
		Person harry = new Person();
		
		//Add event listener to property
		harry.firstNameProperty().addListener( (v,oldValue, newValue) -> {
			System.out.println("Name changed to: " + newValue);
			System.out.println("firstNameProperty(): " + harry.firstNameProperty());
			System.out.println("getFirstName(): " + harry.getFirstname() );
		});
		
		Button submit = new Button("Submit");
		submit.setOnAction( e -> harry.setFirstname("Flora"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(submit);
		
		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
		
	}

}
