package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
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
    ListView<String> listView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Subways");
        button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll(
                "Iron Man",
                "Batman",
                "Superman",
                "Captain America",
                "Spiderman",
                "Thor"
        );

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());




        //Layout
        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


    }
    private void buttonClicked(){
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m: movies)
        {
            message += m + "\n";
        }

        System.out.print(message);
    }




    public static void main(String[] args) {

        launch(args);
    }



}
