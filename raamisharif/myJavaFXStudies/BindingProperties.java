import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BindingProperties extends Application {

	
	Stage window;
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		window.setTitle("Binding Properties");
		
		
		TextField name = new TextField();
		
		Label lbl = new Label();
		
		
		//Bind the text Property of the label such that it automatically updates
		lbl.textProperty().bind(name.textProperty());
		HBox layout = new HBox(5);
		
		
		layout.getChildren().addAll(name,lbl);
		window.setScene(new Scene(layout));
		
		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
