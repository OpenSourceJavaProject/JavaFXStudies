package menus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Menus extends Application {

    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston");

        //file menu
        Menu fileMenu = new Menu("_File");
        
        //menu items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("Create a new File"));
        fileMenu.getItems().add(newFile);
        
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));
        
        //edit menu
        //underscore before the word allows the alt shortcut
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));
        
        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(e -> System.out.println("Pasting some crap"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);
        
        //help menu
        Menu helpMenu = new Menu("_Help");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
            if(showLines.isSelected()){
                System.out.println("Program will display Line numbers");
            }
            else{
                System.out.println("Hiding Line Numbers");
            }
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable AutoSave");  
        autoSave.setSelected(true);
                
        helpMenu.getItems().addAll(showLines, autoSave);
        
        //difficulty radio menu items
        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();
        
        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");
        
        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);
        
        difficultyMenu.getItems().addAll(easy, medium, hard);
        
        //Main menubar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);
        
        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }


}