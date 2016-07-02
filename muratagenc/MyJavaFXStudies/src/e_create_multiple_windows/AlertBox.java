package e_create_multiple_windows;

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

public class AlertBox {

    //made it static so we wont have to create
    //an AlertBox object
    public static void display(String title, String message){
        //new window, so needs a new stage
        Stage window = new Stage();
        
        //the alert box should be on top of the main window in the app
        window.initModality(Modality.APPLICATION_MODAL);
        
        window.setTitle(title);
        window.setMinWidth(250);
        
        //some stuff in the alert box
        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("close the window");
        
        //add action to the button
        closeButton.setOnAction(e -> window.close());
        
        //layout for the window
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        
        //finally the scene
        Scene scene = new Scene(layout);
        window.setScene(scene);
        
        //show it now, but wait it to be closed
        //so it will block everything else, focus stays on this
        //alert box
        window.showAndWait();
        
        
    }
}
