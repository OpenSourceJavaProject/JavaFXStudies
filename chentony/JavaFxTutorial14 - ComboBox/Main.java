package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Button button;
    ComboBox<String> comboBox;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Subways");
        button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good Will Hunting",
                "St. Vincent",
                "Blackhat"
        );

        comboBox.setPromptText("What is your favorite movie?");

        comboBox.setEditable(true);
        button.setOnAction(e -> printMovie());

        comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue()));


        //Layout
        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


    }

    private void printMovie(){
        System.out.println(comboBox.getValue());
    }



    public static void main(String[] args) {

        launch(args);
    }



}
