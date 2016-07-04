package JavaFXDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by ivelisse on 6/27/2016.
 */
public class Main2 extends Application implements EventHandler<ActionEvent> {
    //Application is the class that inherits all the functionality, implements the EventHandler interface for executing
    //handle method when action occurs on an event..ie a button is clicked.


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

        primaryStage.setTitle("Title of the Window"); //sets the title of the window
        button = new Button();
        button.setText("Click me");
        button.setOnAction(this);//whenever this button is clicked look for handle method below in this class

        StackPane layout = new StackPane(); //create layout object of the StackPane class
        layout.getChildren().add(button); //add button to the layout

        Scene scene = new Scene(layout, 300, 250); //Create scene  of the Scene class, pass in layout object and hw
        primaryStage.setScene(scene); //pass in scene object to set Scene of window
        primaryStage.show(); //show the window

    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button) {
            System.out.println("OOoooh I love it when you touch me there");
        }
    }
}
