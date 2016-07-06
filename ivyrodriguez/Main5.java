package JavaFXDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by ivelisse on 6/27/2016.
 */
public class Main5 extends Application {
    //Application is the class that inherits all the functionality

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
        //launch(args) is a method that is called once the main program starts and goes inside the application class
        //it sets ups your javafx application
    }

    @Override
    public void start(Stage primaryStage){
        //the application will call a method called start, start is actually overridden because you are inheriting
        //it from the application class. The start method passes in the primaryStage which is the main window for
        //the application.

        window = primaryStage;
        window.setTitle("thenewboston"); //sets the title of the window
        button = new Button("Click Me");
        button.setOnAction(e -> AlertBox.display("Title of Window", "This is awesome"));

        StackPane layout = new StackPane(); //create layout object of the StackPane class
        layout.getChildren().add(button); //add button to the layout

        Scene scene = new Scene(layout, 300, 250); //Create scene  of the Scene class, pass in layout object and hw
        window.setScene(scene); //pass in scene object to set Scene of window
        window.show(); //show the window

    }

}


