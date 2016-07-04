import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Dynee on 6/21/16.
 */
public class main8 extends Application {

    Stage window;
    Button b;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Alert Boxes");
        b = new Button("Click me!");
        b.setOnAction(e -> AlertBox.display("Title of Window", "Wow much alert!"));

        StackPane layout = new StackPane();
        layout.getChildren().addAll(b);

        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.show();

    }
}
