import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Dynee on 6/2/16.
 */
public class main extends Application implements EventHandler<ActionEvent> {

    Button button;

    // the launch method is the first method called in a javafx app,
    // it sets up configuration information
    // start is the second method called which sets up the look of the app.
    public static void main1(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // sets title of the Stage
        // stage is your window, scene is everything inside the window
        primaryStage.setTitle("JavaFX Tutorial");

        // gives text to button
        button = new Button();
        button.setText("Click Me!");

        // this code says when you click the button look for the code to handle it, in this class
        // you could create a separate class to handle events if you want.
        button.setOnAction(this);

        // alligns button in the center
        // layout sets up how you want everything to look
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // need to pass the scene object to the setScene method of primaryStage
        // this creates the scene inside your stage
        // the show method displays the scene to the user.
        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        // this code is used to get which button some code should be executed for
        if(event.getSource() == button) {
            System.out.println("Hello, World!");
        }
    }
}
