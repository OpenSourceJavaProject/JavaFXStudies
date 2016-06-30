package javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {

    Button button;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of The Window");
        
        /*setting up a button*/
        button = new Button();
        button.setText("Hey baby");
        button.setOnAction(e -> {
            System.out.println("hey now brown cow");
            System.out.println("I am a meatball");
        });
        
        /*Layout*/
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        /*Scene*/
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
      
    
}
