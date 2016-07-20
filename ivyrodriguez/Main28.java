
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main28 extends Application {

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

        bucky.firstNameProperty().addListener( (v, oldValue, newValue) -> { //v is the object
            System.out.println("Name changed to " + newValue);
            System.out.println("firstNameProperty(): " + bucky.firstNameProperty());//gives the location of where the
            //object is stored in memory
            System.out.println("getFirstName(): " + bucky.getFirstName());
        });

        button = new Button("Submit");
        button.setOnAction(e -> bucky.setFirstName("Porky"));//the listener above code fires off when a change occurs
        //to the firstNameProperty.
        // Clicking the button is firing a method which changes the first name property of the
        //object bucky which fires off the listener.

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }


}
