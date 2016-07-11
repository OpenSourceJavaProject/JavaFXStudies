package properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Properties extends Application {

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
        
        bucky.nameProperty().addListener((v, oldValue, newValue) -> {
            System.out.println("Name Changed to " + newValue);
            System.out.println("firstNameProperty(): " + bucky.nameProperty());
            System.out.println("getfirstName(): " + bucky.getName());
        });
        
        button = new Button("Submit");
        button.setOnAction(e -> bucky.setName("Porky"));
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }


}