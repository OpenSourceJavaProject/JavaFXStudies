import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CheckBoxTutorials extends Application {
	Stage window;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Check Box Tutorial");
		
		window.setMinHeight(400);
		window.setMinWidth(400);
		
		Label lbl = new Label("What would you like in the Sandwich?");
		
		CheckBox lettuce = new CheckBox("Lettuce");
		CheckBox tomatoes = new CheckBox("Tomatoes");
		CheckBox olives = new CheckBox("Olives");
		CheckBox cheese = new CheckBox("Cheese");
		
		lettuce.setSelected(true);
		
		
		GridPane gr = new GridPane();
		gr.setPadding(new Insets(20,20,20,20));
		
		gr.add(lbl, 0, 0);
		gr.add(olives, 0, 1);
		gr.add(lettuce, 1, 1);
		gr.add(tomatoes, 0, 2);
		gr.add(cheese, 1, 2);
		
		window.setScene(new Scene(gr));
		
		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
