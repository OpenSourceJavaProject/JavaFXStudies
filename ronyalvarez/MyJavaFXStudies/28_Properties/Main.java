import com.intellij.codeInsight.intention.impl.ConcatenationToMessageFormatAction;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
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
        window.setTitle("thenewboston");

        Person bucky = new Person();

        bucky.firstNameProperty().addListener( (v, oldValue, newValue) -> {
            System.out.println("Name changed to " + newValue);
            System.out.println("firstNameProperty(): " + bucky.firstNameProperty());
            System.out.println("getFirstName(): " + bucky.getFirstName());
        });

        button = new Button("Submit");
        button.setOnAction(e -> bucky.setFirstName("Porky"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

}
