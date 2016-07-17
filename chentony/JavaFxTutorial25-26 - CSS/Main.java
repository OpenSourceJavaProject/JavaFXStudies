package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    BorderPane layout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Tony Chen");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        //Name label
        Label nameLabel = new Label("Username");
        nameLabel.setId("bold-label");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name input
        TextField nameinput = new TextField();
        GridPane.setConstraints(nameinput, 1, 0);

        //Password
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password input
        TextField passinput = new TextField();
        passinput.setPromptText("Password");
        GridPane.setConstraints(passinput, 1, 1);

        //LoginButton
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton,1,2);

        //Sign up
        Button signupButton = new Button("Sign Up");
        signupButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signupButton,1,3);



        gridPane.getChildren().addAll(nameLabel,nameinput,passLabel,passinput,loginButton, signupButton);

        Scene scene = new Scene(gridPane, 300, 200);
        scene.getStylesheets().add("/sample/Viper.css");
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {

        launch(args);
    }



}
