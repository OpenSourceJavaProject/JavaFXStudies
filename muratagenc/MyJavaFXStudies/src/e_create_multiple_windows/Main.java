package e_create_multiple_windows;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    
    //data members
    Stage window;
    Button button;
    
    //constructors
    
    //methods
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
    
        window = primaryStage;
        window.setTitle("this is a title");
        
        button = new Button("click me");
        button.setOnAction(e -> AlertBox.display("Alert Box", "alerting now.."));
        //layout
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        //scene
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
    }
}
