package javafxdemo10;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXDemo10 extends Application{

    Stage window;

     public static void main(String[] args) {
        //multiple windows
       launch(args);        
    }
    
//Tutorial 10
    //input and validation
    @Override
    public void start(Stage PrimaryStage) throws Exception{
        window = PrimaryStage;
        window.setTitle("JavaFX - The New Boston");
        
        //Form
        TextField nameInput = new TextField();
        Button button = new Button("Click Me");
        button.setOnAction(e -> {
            isInt(nameInput, nameInput.getText());
            
        });
        
        
        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);
        
        
        
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is " + age);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Error: " + message + " is NaN");
            return false;
        }
    }


}
