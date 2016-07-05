import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmbeddingLayouts extends Application{

		Stage window; 
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		window.setTitle("Main Window");
		
		HBox topMenu = new HBox(); 
		Button btn1 = new Button("Title");
		Button btn2 = new Button("Edit");
		Button btn3 = new Button("View");
		topMenu.getChildren().addAll(btn1, btn2, btn3);

		VBox leftMenu = new VBox(); 
		Button btn4 = new Button("Project1");
		Button btn5 = new Button("Project2");
		Button btn6 = new Button("Project3");
		leftMenu.getChildren().addAll(btn4, btn5, btn6);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		
		Scene scene = new Scene(borderPane, 300,200);
		
		window.setScene(scene);
		window.show();
		
	}

}//End of Class
