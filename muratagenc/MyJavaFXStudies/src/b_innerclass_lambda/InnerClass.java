package b_innerclass_lambda;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InnerClass extends Application {
    
    Button button;
    
    public static void main(String []args){
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Inner Class and Lambdas");
        button = new Button();
        button.setText("Click Me");
        
        //you don't have to check multiple resources
        //with anonymous classes, since they are already
        //implemented for a specific object
        //downside: needs to be implemented for each
        //object..
        button.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                System.out.println("I am anonymous class");
            }
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
