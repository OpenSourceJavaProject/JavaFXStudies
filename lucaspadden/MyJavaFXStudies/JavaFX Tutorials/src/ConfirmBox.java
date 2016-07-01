import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Dynee on 6/24/16.
 */
public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message) {
        Stage window = new Stage();

        // makes it so you can't click out of the window until you deal with it.
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        Label label = new Label();
        label.setText(message);


        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
           answer  = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer  = false;
            window.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        return answer;
    }
}
