import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Dynee on 6/21/16.
 */
public class main9 extends Application {

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
        b.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of window", "are you sure you want to do that?");
            if(result == true) {
                System.out.println(result);
            }
            else if(result == false) {
                System.out.println(result);
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(b);

        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.show();

    }
}
