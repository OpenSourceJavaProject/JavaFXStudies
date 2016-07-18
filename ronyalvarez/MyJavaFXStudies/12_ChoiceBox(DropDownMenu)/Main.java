import com.intellij.codeInsight.intention.impl.ConcatenationToMessageFormatAction;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        button = new Button("Click Me!");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().addAll("Apples", "Bananas", "Bacon", "Ham", "Meatballs");

        //Inital value
        choiceBox.setValue("Apples");

        button.setOnAction( event -> getChoice(choiceBox));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();

    }

    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }

}
