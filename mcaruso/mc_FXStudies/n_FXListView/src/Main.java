import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage window;
	Scene scene;
	Button btn;
	ListView<String> listview;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ListView Demo");
		
		btn = new Button("Submit");
		
		listview = new ListView<>();
		listview.getItems().addAll(
				"Chuck",
				"Blue Bloods",
				"NCIS L.A.",
				"Blacklist",
				"Blind Spot",
				"Scorpion",
				"Supergirl"
				
				);
		
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);;
		
		btn.setOnAction( e -> selectedItems());
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		layout.getChildren().addAll(listview, btn);
		
		scene = new Scene(layout, 300, 200);
		
		window.setScene(scene);
		window.show();
		
	}
	
	//Retrieve selected items from list view
	private void selectedItems(){
		String msg = "";
		ObservableList<String> items;
		
		items = listview.getSelectionModel().getSelectedItems();
		for(String item : items){
			msg += item + "\n";
		}
		System.out.println(msg);
	}

}
