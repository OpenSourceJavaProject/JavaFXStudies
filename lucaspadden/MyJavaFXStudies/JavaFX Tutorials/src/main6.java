import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * Created by Dynee on 6/16/16.
 */
public class main6 extends Application implements EventHandler<ActionEvent>{

    Button b;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Review!!!!");

        b = new Button();
        b.setText("Click Me!");

        b.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(b);

        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handle(ActionEvent e) {
        if(e.getSource() == b) {
            System.out.println("HI!!!");
        }
    }
}
