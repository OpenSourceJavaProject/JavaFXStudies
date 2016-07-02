import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleScenes extends Application {

	Stage window;
	Scene scene1, scene2;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("My title");
		
		//Set up the first Scene
		Label label1 = new Label("Welcome to the first Scene");
		Button button1 = new Button("Click to go to Scene 2");
		button1.setOnAction(e -> window.setScene(scene2));
		VBox layout1 = new VBox();
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 100, 200);
		
		//Set up second Scene
		Label label2 = new Label("You are now on scene 2");
		Button button2 = new Button("Go back to Scene 1");
		button2.setOnAction(e -> window.setScene(scene1));
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, 400, 400);
		
		
		//Set up window and set default scene to scene 1
		window.setScene(scene1);
		window.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
