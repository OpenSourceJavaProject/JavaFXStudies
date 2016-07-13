package JavaFXDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main12 extends Application {
    //Application is the class that inherits all the functionality

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
        //launch(args) is a method that is called once the main program starts and goes inside the application class
        //it sets ups your javafx application
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //the application will call a method called start, start is actually overridden because you are inheriting
        //it from the application class. The start method passes in the primaryStage which is the main window for
        //the application.

        window = primaryStage;
        window.setTitle("ChoiceBox Demo");//sets the title of the window
        button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Apples"); //add one at a time
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Bacon", "Ham", "Meatballs");//add more then one item

        //Set a default value
        choiceBox.setValue("Apples");

        button.setOnAction(e -> getChoice(choiceBox));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button); //add button and dropdown list to the layout

        Scene scene = new Scene(layout, 300, 250); //Create scene  of the Scene class, pass in layout object and hw
        window.setScene(scene); //pass in scene object to set Scene of window
        window.show(); //show the window

    }

    //To get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(food + "\n");
    }


}

