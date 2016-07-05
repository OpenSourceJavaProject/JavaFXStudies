import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
		Stage window;
		Button btn; 
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Closing Properly");
		window.setOnCloseRequest( e -> {
			//prevent default close event
			e.consume();
			//implement our own close logic
			closeProgram();
		});
		
		btn = new Button("Close Program");
		btn.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(btn);
		
		Scene scene = new Scene(layout, 300, 260);
		
		window.setScene(scene);
		window.show();
		
	}
	
	private void closeProgram(){
		boolean answer = ConfirmBox.display("Confirm", "Are you sure you want to exit?");
		if(answer)
			window.close();
	}

}
