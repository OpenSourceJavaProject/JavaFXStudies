package JavaFXDemo;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

//AlertBox displays message to the user
public class AlertBox {

    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);//doesn't allow user to interact with other window until
        //finished with this one
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);//will set the message to the message you pass in
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();//goes together with Modality, doesn't let user interact with other window until this one
        //is closed
    }


}
