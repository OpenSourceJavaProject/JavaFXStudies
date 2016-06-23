package a_hello_world;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class HelloWorld extends Application {

    Button button;
    
    public static void main(String[] args) {

        launch(args);
       
    }

    @Override
    public void start (Stage primaryStage) throws Exception{
        
        primaryStage.setTitle("Hello World");
        
        button = new Button("Click me");
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
