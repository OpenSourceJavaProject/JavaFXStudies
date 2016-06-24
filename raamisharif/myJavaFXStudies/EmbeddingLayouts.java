import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class EmbeddingLayouts extends Application {

	Stage window; 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//Set up the window
		window = primaryStage;
		window.setTitle("Embedding Layouts");
		
		FileChooser filechooser = new FileChooser();
		filechooser.setTitle("Open File...");
		
		//The file Menu
		Menu fileMenu = new Menu("File");
		
		//The Menu Items
		MenuItem newFile = new MenuItem("_New...");
		newFile.setOnAction(e -> System.out.println("New File..."));
		fileMenu.getItems().add(newFile);
		
		
		MenuItem open = new MenuItem("Open...");
		open.setOnAction(e -> System.out.println("You choose to open " + filechooser.showOpenDialog(window).getName()));
		fileMenu.getItems().add(open);
		
		fileMenu.getItems().add(new MenuItem("Save..."));
		
		fileMenu.getItems().add(new SeparatorMenuItem());
		
		Menu settings = new Menu("Settings");
		
		CheckMenuItem autosave = new CheckMenuItem("AutoSave");
		autosave.setOnAction(e -> {
			if(autosave.isSelected()){
				System.out.println("Now Autosaving");
			}
			else{
				System.out.println("No longer Autosaving");
			}
		});
		
		Menu difficulty = new Menu("Difficulty");
		ToggleGroup difficultyToggle = new ToggleGroup();
		RadioMenuItem easy = new RadioMenuItem("Easy");
		RadioMenuItem normal = new RadioMenuItem("Normal");
		RadioMenuItem hard = new RadioMenuItem("Hard");
		difficultyToggle.getToggles().addAll(easy,normal,hard);
		difficulty.getItems().addAll(easy,normal,hard);
		
		
		
		autosave.setSelected(true);
		
		settings.getItems().add(autosave);
		settings.getItems().add(new SeparatorMenuItem());
		settings.getItems().add(difficulty);
		fileMenu.getItems().add(settings);
		
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exit..."));
		
		//The Menu Bar
		MenuBar menubar = new MenuBar();
		menubar.getMenus().addAll(fileMenu);
		
		
		
		//Create the left Layout
		VBox leftLayout = new VBox(3);
		Label label = new Label("Left Layout");
		Button lb = new Button("A left Button");
		leftLayout.getChildren().addAll(label, lb);
		
		//Create the center Layout
		StackPane centerLayout = new StackPane();
		Button centerButton = new Button("A center Button");
		centerLayout.getChildren().add(centerButton);
		
		//Create the Bottom Layout
		HBox bottomLayout = new HBox(10);
		Label lbl1 = new Label("First Label on Bottom");
		Label lbl2 = new Label("Second Label on Bottom");
		Label lbl3 = new Label("Third Label on Bottom");
		bottomLayout.getChildren().addAll(lbl1, lbl2, lbl3);
		
		//Set up overall Layout
		BorderPane layout = new BorderPane();
		layout.setTop(menubar);
		layout.setBottom(bottomLayout);
		layout.setCenter(centerLayout);
		layout.setLeft(leftLayout);
		
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.show();
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
