package JavaFXDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main10 extends Application {
    //Application is the class that inherits all the functionality

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
        //launch(args) is a method that is called once the main program starts and goes inside the application class
        //it sets ups your javafx application
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //the application will call a method called start, start is actually overridden because you are inheriting
        //it from the application class. The start method passes in the primaryStage which is the main window for
        //the application.

        window = primaryStage;
        window.setTitle("thenewboston");//sets the title of the window

       //Form
        TextField nameInput = new TextField();
        button = new Button("Click me");
        button.setOnAction(e -> isInt(nameInput, nameInput.getText()) );

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button); //add button and Input field to the layout

        Scene scene = new Scene(layout, 300, 250); //Create scene  of the Scene class, pass in layout object and hw
        window.setScene(scene); //pass in scene object to set Scene of window
        window.show(); //show the window

    }

    private boolean isInt(TextField input, String message) {//method that will validate whether the input is a number
        //better to use input instead of messagebecause can refer to it in order to put a color in input TextField
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
    }

}
