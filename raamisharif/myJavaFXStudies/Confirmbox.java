import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Confirmbox {

	public static boolean answer;

	public static boolean display(String title, String message){

		//Set up the window
		Stage window = new Stage();
		window.setTitle(title);
		window.initModality(Modality.APPLICATION_MODAL);

		//Set up items
		Label lbl = new Label(message);
		Button yes = new Button("Yes");
		Button no = new Button("No");
		
		//Set up action handlers
		yes.setOnAction(e -> {
			answer = true;
			window.close();
		});
		no.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		//Set up layout
		VBox layout = new VBox(10);
		layout.getChildren().addAll(lbl, yes, no);
		layout.setAlignment(Pos.CENTER);

		Scene s1 = new Scene(layout);
		window.setScene(s1);
		window.showAndWait();

		return answer; 
	}

}
