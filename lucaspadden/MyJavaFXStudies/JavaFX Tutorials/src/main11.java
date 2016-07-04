import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Dynee on 6/21/16.
 */
public class main11 extends Application {

    Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Alert Boxes");

        HBox topMenu = new HBox();
        Button fileButton = new Button("File");
        Button editButton = new Button("Edit");
        Button viewButton = new Button("View");
        topMenu.getChildren().addAll(fileButton, editButton, viewButton);

        VBox leftMenu = new VBox(5);
        Button a = new Button("a");
        Button b = new Button("b");
        Button c = new Button("c");
        leftMenu.getChildren().addAll(a, b, c);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 200, 200);
        window.setScene(scene);
        window.show();

    }
}
