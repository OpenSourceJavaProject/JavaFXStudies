package JavaFXDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by ivelisse on 6/27/2016.
 */
public class Main8 extends Application {
    //Application is the class that inherits all the functionality

    Stage window;

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
        window.setTitle("thenewboston"); //sets the title of the window

        //Demo, do not use for Creating top menu other library for that
        HBox topMenu = new HBox();//menu with bottons going across
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox(); //menu with bottons stacked on top of another
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);


        //Embedding layouts
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu); //setTop method takes parmeter of what goes inside Top of BorderPane layout
        borderPane.setLeft(leftMenu); //setLeft method takes parameter of what goes inside Left of BorderPane layout

        Scene scene = new Scene(borderPane, 300, 250); //Create scene  of the Scene class, pass in name of the layout object and hw
        window.setScene(scene); //pass in scene object to set Scene of window
        window.show(); //show the window

    }

}


