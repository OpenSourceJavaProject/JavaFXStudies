package JavaFXDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main11 extends Application {
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
        window.setTitle("Bucky's Meat Subs");//sets the title of the window

        //Checkboxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true); //checks the box by default, user can still unselect it later

        //Button
        button = new Button("Order Now!");
        button.setOnAction(e -> HandleOptions(box1, box2));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, button); //add button to the layout

        Scene scene = new Scene(layout, 300, 250); //Create scene  of the Scene class, pass in layout object and hw
        window.setScene(scene); //pass in scene object to set Scene of window
        window.show(); //show the window

    }

    //Handle checkbox options
    private void HandleOptions(CheckBox box1, CheckBox box2){
        String message = "Users order:\n";

        if(box1.isSelected())
            message += "Bacon\n";

        if(box2.isSelected())
            message += "Tuna\n";

        System.out.println(message);
    }


}

