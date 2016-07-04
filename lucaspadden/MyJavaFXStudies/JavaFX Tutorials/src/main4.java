import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Dynee on 6/2/16.
 */
public class main4 extends Application{

    Button depositButton;
    Button withdrawButton;
    Button checkBalanceButton;

    // create an account object for testing
    Account a = new Account(1, "Lucas Padden", 8024, 100.0);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ATM Application");

        depositButton = new Button();
        depositButton.setText("Deposit");

        withdrawButton = new Button();
        withdrawButton.setText("Withdraw");

        checkBalanceButton = new Button();
        checkBalanceButton.setText("Check Balance");

        // can use other things than layouts to add your buttons too
        // there are custom made layouts like vbox and hbox
        // create a VBox to add the buttons in a column
        VBox vb = new VBox();
        vb.setPadding(new Insets(10));
        vb.setSpacing(10);

        vb.getChildren().addAll(depositButton, withdrawButton, checkBalanceButton);

        Scene scene = new Scene(vb, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        // create a new window for deposit button.

        depositButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        withdrawButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        checkBalanceButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

    }
}
