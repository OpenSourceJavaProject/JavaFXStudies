package c_lambdas_intro;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LambdasIntro extends Application {
    
    Button button;
    
    public static void main(String []args){
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Inner Class and Lambdas");
        button = new Button();
        button.setText("Click Me");
        
        //Lambdas are available only with Java 8 and above..
        button.setOnAction(e -> System.out.println("First Lambda Expression"));
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
