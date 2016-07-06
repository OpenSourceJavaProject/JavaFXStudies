package JavaFXDemo;

import javafx.application.Application;
import javafx.scene.Scene; //scene is another view of the content inside the window
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main4 extends Application {
    //Application is the class that inherits all the functionality

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
        //launch(args) is a method that is called once the main program starts and goes inside the application class
        //it sets ups your javafx application
    }

    @Override
    public void start(Stage primaryStage) {
        //the application will call a method called start, start is actually overridden because you are inheriting
        //it from the application class. The start method passes in the primaryStage which is the main window for
        //the application.

        window = primaryStage;
        Label label1 =new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - Children are laid out in vertical columns, stacked on top of

        VBox layout1 = new VBox(20); //columns are seperated by 20 pixels
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        //Button 2

        Button button2 = new Button("Go back to scene1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();



    }

}
