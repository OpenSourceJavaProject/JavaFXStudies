

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DropDownTutorial extends Application {

	Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Drop Down Tutorial");
		
		//Left side
		Label leftLabel = new Label("A ChoiceBox");
		ChoiceBox<String> choicebox = new ChoiceBox<>();
		choicebox.getItems().addAll("Choose a Value: ", "Hello1", "Hello2", "Hello3");
		choicebox.getSelectionModel().select(0);
		
		Button submit1 = new Button("Submit Choice");
		submit1.setOnAction(e -> choiceBoxSubmit(choicebox));
		
		VBox leftLayout = new VBox(4);
		leftLayout.getChildren().addAll(leftLabel, choicebox, submit1);
		
		
		//Right side
		Label rightLabel = new Label("A ComboBox");
		ComboBox<String> combobox = new ComboBox<>();
		combobox.getItems().addAll("Hello4", "hello5", "hello6");
		combobox.setPromptText("Choose a Value: ");
		combobox.setEditable(true);
		
		Button submit2 = new Button("Submit Combo");
		submit2.setOnAction(e -> comboBoxSubmit(combobox));
		
		VBox rightLayout = new VBox(4);
		rightLayout.getChildren().addAll(rightLabel, combobox, submit2);
		
		
		//Set up the ListView
		VBox listLayout = new VBox(3);
		
		ListView<String> listview = new ListView<>();
		listview.getItems().addAll("An Item", "A second item", "A thrid item");
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		Button submit3 = new Button("Submit List View");
		submit3.setOnAction(e -> listViewSubmit(listview));
		
		listLayout.getChildren().addAll(listview, submit3);
		
		
		//Set up main Layout
		HBox layout = new HBox(5);
		layout.setPadding(new Insets(20, 20,20,20));
		layout.getChildren().addAll(leftLayout,rightLayout, listLayout);
		
		window.setScene(new Scene(layout));
		window.show();
		
	}
	
	private void listViewSubmit(ListView<String> listview){
		ObservableList<String> list = listview.getSelectionModel().getSelectedItems();
		list.stream().forEach(i -> System.out.println(i));
	}
	
	private void choiceBoxSubmit(ChoiceBox<?> choicebox){
		if(choicebox.getSelectionModel().getSelectedIndex() == 0){
			AlertBox.display("ChoiceBox Error" , "You Must choose a value for choice Box");
			return;
		}
		AlertBox.display("ChoiceBox Success", "You have succesfully submitted " + choicebox.getValue());
		
	}
	
	private void comboBoxSubmit(ComboBox<?> combo){
		AlertBox.display("ComboBox Message", " You have successfully submitted a value \" " + combo.getValue() + "\"");
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
