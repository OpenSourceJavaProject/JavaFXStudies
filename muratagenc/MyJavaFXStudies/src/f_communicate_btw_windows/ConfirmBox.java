package f_communicate_btw_windows;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


//it's a simple Alert Box, has a title, and a message
//but, not just an alert box, also this is a template
//you can use to create complex dialog boxes

public class ConfirmBox {
    
    //data members
    private static boolean answer;
    
    //constructors
    
    
    //methods
    public static boolean display(String title, String message){

        //new window, so needs a new stage
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);      
        window.setTitle(title);
        window.setMinWidth(250);
        
        
        Label label = new Label();
        label.setText(message);
        
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        
        //if any of the buttons clicked,
        //change the value of answer
        yesButton.setOnAction(e -> {
            //multiple statements
            answer = true;
            window.close();
        });
        
        noButton.setOnAction(e -> {
            //multiple statements
            answer = false;
            window.close();
        });
        
        //layout for the window
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        
        //finally the scene
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();  
        
        return answer;
        
    }
}
