import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

	public static void display(String title, String msg){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label();
		label.setText(msg);
		Button closeButton = new Button("Close Window 2");
		closeButton.setOnAction( e -> window.close());
		
		VBox layout = new VBox(20);
		layout.getChildren().add(label);
		layout.getChildren().add(closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout, 200, 200);
		window.setScene(scene);
		window.showAndWait();
		
	}

}
