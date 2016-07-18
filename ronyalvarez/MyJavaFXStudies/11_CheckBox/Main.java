import com.intellij.codeInsight.intention.impl.ConcatenationToMessageFormatAction;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - Rony Alvarez");

        //Checkboxes
        CheckBox box1 = new CheckBox("bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);


        //Form
        TextField nameInput = new TextField();
        button = new Button("Order Now!");
        button.setOnAction( event -> handleOptions(box1, box2));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();

    }

    //Handle checkbox options
    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "User's order: \n";

        if(box1.isSelected()) {
            message += "Bacon\n";
        }

        if(box2.isSelected()) {
            message += "Tuna\n";
        }

        System.out.println(message);

    }

}
