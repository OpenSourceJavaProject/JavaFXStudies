/**
 * Created by Dynee on 6/20/16.
 */

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main7 extends Application {

    Stage window;
    Scene scene1, scene2;
    Button firstButton;
    Button secondButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene!");
        firstButton = new Button("Go to scene 2");
        firstButton.setOnAction(e -> window.setScene(scene2));


        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, firstButton);
        scene1 = new Scene(layout1, 200, 200);



        Label label2 = new Label("Go to the 2nd scene pls..");
        secondButton = new Button("Go to scene 1");
        secondButton.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(label2, secondButton);

        scene2  = new Scene(layout2, 600, 300);

        window.setTitle("Im so tired");
        window.setScene(scene1);
        window.show();



    }
}
