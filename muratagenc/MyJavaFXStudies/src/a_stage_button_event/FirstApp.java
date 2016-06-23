package a_stage_button_event;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class FirstApp extends Application implements EventHandler<ActionEvent> {

    Button button;
    
    public static void main(String[] args) {

        launch(args);
       
    }

    @Override
    public void start (Stage primaryStage) throws Exception{
        
        primaryStage.setTitle("Hello World");
        
        button = new Button();
        button.setText("Click me");
        button.setOnAction(this);
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    @Override
    public void handle(ActionEvent event){
        if(event.getSource() == button){
            System.out.println("Hello World");
        }
    }
}
