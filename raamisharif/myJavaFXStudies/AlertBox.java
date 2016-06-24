import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

		public static void display(String title, String message){
			
			//Set up the window
			Stage window = new Stage();
			window.setTitle(title);
			window.initModality(Modality.APPLICATION_MODAL);
			
			Label lbl = new Label(message);
			StackPane layout = new StackPane();
			layout.getChildren().add(lbl);
			
			Scene s1 = new Scene(layout);
			window.setScene(s1);
			window.showAndWait();
			
			System.out.println("Ended");
		}
}
