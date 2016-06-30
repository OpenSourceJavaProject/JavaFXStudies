package javafxdemovideo5;

import static java.awt.SystemColor.window;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JavaFXDemoVideo5 extends Application{
    Stage window;

     public static void main(String[] args) {
        //multiple windows
       launch(args);        
    }
    

//Tutorial 9
    //GridPanes layout
    @Override
    public void start(Stage PrimaryStage){
        window = PrimaryStage;
        window.setTitle("JavaFX - The New Boston");
        
        GridPane grid = new GridPane();
        //spacing
        grid.setPadding(new Insets(10, 10, 10, 10));
        //virticle spacing
        grid.setVgap(8);
        //horizontal spacing
        grid.setHgap(10);
        
        //name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);
        
        //name input
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput, 1, 0);
        
        //password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);
        
        //name input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
        
        Button login = new Button("Login");
        GridPane.setConstraints(login, 1, 2);
        
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, login);
        
        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }
    
    
    
    
    
//    Tutorial 5-8{alert confirm and layout}
//    Button button;
    
//    public static void main(String[] args) {
//        //multiple windows
//       launch(args);        
//    }
//    
//    @Override
//    public void start(Stage PrimaryStage){
//        window = PrimaryStage;
//        window.setTitle("JavaFX - The New Boston");
//        window.setOnCloseRequest(e -> {
//            //consumes the request 
//            e.consume();
//            closeProgram();
//        });
//        
//
////        button = new Button("Close Program");
////        button.setOnAction(e -> {
////            closeProgram();        
////        });
//        
//        HBox topMenu = new HBox();
//        Button buttonA = new Button("File");
//        Button buttonB = new Button("Edit");
//        Button buttonC = new Button("View");
//        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
//        
//        VBox leftMenu = new VBox();
//        Button buttonD = new Button("D");
//        Button buttonE = new Button("E");
//        Button buttonF = new Button("F");
//        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);
//    
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(topMenu);
//        borderPane.setLeft(leftMenu);
//        
////        StackPane layout = new StackPane();
////        layout.getChildren().add(button);
//        Scene scene = new Scene(borderPane, 300, 250);
//        window.setScene(scene);
//        window.show();
//        
//    }
//    
//    private void closeProgram(){
//        Boolean answer = Confirmbox.display("Title", "are you sure you want to do that?");
//        if(answer){
//            window.close();
//        }
//    }
}
