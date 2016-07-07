import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	Stage window; 
	Scene scene;
	Button btn;
	ComboBox<String> comboBox;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		window.setTitle("Combo Box Demo");
		
		btn = new Button("Submit");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll(
				"New York Yankees",
				"Texas Rangers",
				"Boston Red Sox",
				"Baltimore Oriols"
				);
		//comboBox.setPromptText("Select your favorite team?");
		comboBox.setEditable(true);
		comboBox.setOnAction( e -> System.out.println("User selected: " + comboBox.getValue()));
		btn.setOnAction( e -> printTeam());
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(comboBox,btn);
		
		scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
		
	}
	
	private void printTeam(){
		System.out.println(comboBox.getValue());
	}
	
	

}
