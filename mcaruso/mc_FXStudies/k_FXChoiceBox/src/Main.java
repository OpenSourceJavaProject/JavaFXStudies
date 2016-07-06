import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;

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
		window.setTitle("Choice Box");
		
		//one way of adding items to ChoiceBox
		String[] moreFruits = {"Mango", "Tomatoe", "Strawberry" };
		int i;
		
		// Instantiate a ChoiceBox obj
		ChoiceBox<String> dropDown = new ChoiceBox<>();
		//add items to your observable list ChoiceBox
		dropDown.getItems().add("Apples");
		dropDown.getItems().add("Peaches");
		dropDown.getItems().add("Plums");
		dropDown.getItems().addAll("Oranges", "Grapes", "Necturines");
		
		//to add items from an array of choices
		for(i= 0; i < moreFruits.length; i++){
			dropDown.getItems().addAll( moreFruits[i] );
		}
		
		
		
		
		//set a default value
		dropDown.setValue("Oranges");
		//Listen for selection changes
		dropDown.getSelectionModel().selectedItemProperty()
		.addListener((v, oldValue, newValue) -> System.out.println(newValue));
		//btn = new Button("Click Me!");
		//btn.setOnAction( e -> getChoice(dropDown));
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		layout.getChildren().addAll(dropDown);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	//Method to get value of selected choice on button click
/*	private void getChoice(ChoiceBox<String> dropDown){
		
		String fruit = dropDown.getValue();
		
		System.out.println("You chose: " + fruit);
		
	}*/

}
