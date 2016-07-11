package JavaFXDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main9 extends Application {
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
        window.setTitle("thenewboston - JavaFX"); //sets the title of the window

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));//amount of padding you want to add to each edge, i.e 10 pixel
        //padding around your layout and the window
        grid.setVgap(8); //setVgap method sets the padding for vertical spacing for cells in the grid
        grid.setHgap(10);//setHgap method sets the padding for horizontal spacing for cells in the grid

        //Name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);//setConstraints positions the object in the grid. This method
        //accepts 3 parameters, object, column index, row index. 0 indicates first, 1 indicates seconds, etc

        //Name input
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput, 1, 0);

        //Pasword label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password"); //password hint
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);//adds all the objects to
        //the grid

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);

        window.show(); //show the window

    }

}


