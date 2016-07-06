import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxInput extends Application{

	Stage window;
	Button orderButton; 
	Scene scene; 
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		window.setTitle("The Sub Shop");
		
		//checkboxes
		CheckBox box1 = new CheckBox("MeatBall Parm");
		CheckBox box2 = new CheckBox("Chicken Parm");
		box2.setSelected(true);
		CheckBox box3 = new CheckBox("Eggplant Parm");
		
		
		orderButton = new Button("Order Now");
		orderButton.setOnAction( e -> handleOptions(box1,box2,box3));
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		layout.getChildren().addAll(box1, box2, box3, orderButton);
		
		scene = new Scene(layout, 300, 250);
		
		window.setScene(scene);
		window.show();
		
		
	}
	
	// handle checkbox options
	private void handleOptions(CheckBox boxA, CheckBox boxB, CheckBox boxC){
		String message = "You ordered:";
		
		if(boxA.isSelected())
			message += "\n" + boxA.getText();
		
		if(boxB.isSelected())
			message += "\n" + boxB.getText();
		
		if(boxC.isSelected())
			message += "\n" + boxC.getText();
		
		System.out.println(message);
	}
	

}
