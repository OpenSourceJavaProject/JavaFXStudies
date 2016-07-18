import com.intellij.codeInsight.intention.impl.ConcatenationToMessageFormatAction;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - Rony Alvarez");

        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });

        button = new Button("Close Program");
        button.setOnAction(event -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Title", "Are you sure you want to exit?");
        if(answer) {
            window.close();
        }
    }

}
