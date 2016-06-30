import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultiScene extends Application{
	Stage window;
	Scene scene1, scene2;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		window.setTitle("Multi Scene");
		
		Label label = new Label("Welcome to Scene 1");
		Button btn1 = new Button("Click for scene 2");
		btn1.setOnAction(e -> window.setScene(scene2));
		//Layout 1 
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label, btn1);
		scene1 = new Scene(layout1, 300, 300);
		// Scene 2
		Label label2 = new Label("Welcome to scene 2");
		Button btn2 = new Button("Go back to scene 1");
		btn2.setOnAction(e -> window.setScene(scene1));
		HBox layout2 = new HBox(20);
		layout2.getChildren().addAll(label2, btn2);
		
		scene2 = new Scene(layout2, 500, 500);
		
		//set scene 1 as default scene
		window.setScene(scene1);
		window.show();
		
	}

}
