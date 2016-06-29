import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	Button btn;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Lambda Expression");
		
		btn = new Button();
		btn.setText("Click Here");
		btn.setOnAction(e -> System.out.println("From Lambda Expression"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(btn);
		
		Scene scene = new Scene(layout, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}

}
