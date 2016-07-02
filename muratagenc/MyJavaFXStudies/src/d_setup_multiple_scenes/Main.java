/*
creating multiple scenes
it just changes the content of the current view
does not switch between inner windows
*/

package d_setup_multiple_scenes;


import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//always extend Application for JavaFX
public class Main extends Application {

    //data members
    Stage window; 
    Scene scene1, scene2;
    
    //constructors
    
    //methods
    
    public static void main(String[] args) {
        launch(args); //launch the GUI
    }
    
    //launch calls start(), so implement that
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        
        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to scene 2");
        
        //add action to the button, which will switch the
        //view to scene2. default is scene 1.
        //! with lambdas, you can run methods without using inner classes
        button1.setOnAction(e -> window.setScene(scene2));
        
        //layout 1 for scene 1: children are laid out in vertical 
        //column. on top of eachother. 20 pixels
        VBox layout1 = new VBox(20);
        //add stuff to the layout
        layout1.getChildren().addAll(label1, button1);
        
        //and add layout to the scene
        scene1 = new Scene(layout1, 200, 200);
        
        /*
        we have a stage, and a scene which uses a certain layout.
        */
        
        //now, we will create the second scene
        //button and label for scene2
        Label label2 = new Label("Welcome to the SECOND scene!");
        Button button2 = new Button("Go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));
        
        //this time we will use a diffrent layout
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(label2, button2);
        //put everything to the scene2
        scene2 = new Scene(layout2, 600, 300);
        
        //we need to tell the window which scene should be 
        //visible by default
        window.setScene(scene1);
        window.setTitle("title here");
        window.show();
        
    }
}
