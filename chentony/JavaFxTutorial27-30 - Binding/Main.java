package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Tony Chen");

        //Input and labels
        TextField userinput = new TextField();
        userinput.setMaxWidth(200);
        Label firstLabel = new Label("Welcome to the site ");
        Label secondLabel = new Label();

        HBox bottomtext = new HBox(firstLabel, secondLabel);
        bottomtext.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10,userinput, bottomtext);
        vBox.setAlignment(Pos.CENTER);

        secondLabel.textProperty().bind(userinput.textProperty());

        Scene scene = new Scene(vBox, 300, 200);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {

        launch(args);
    }



}
