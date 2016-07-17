package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    TreeView<String> treeView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Subways");

        TreeItem<String> root, Lakers, Knicks;

        //Root
        root = new TreeItem<>();
        root.setExpanded(true);

        //Lakers
        Lakers = makeBranch("Lakers", root);
        makeBranch("Kobe", Lakers);
        makeBranch("Shaq", Lakers);
        makeBranch("Clarkson", Lakers);

        //Knicks
        Knicks = makeBranch("Knicks", root);
        makeBranch("Melo", Knicks);
        makeBranch("Rose", Knicks);
        makeBranch("Noah", Knicks);

        //Create tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> {
                    if(newValue != null)
                        System.out.println(newValue.getValue());
                        });




        //Layout
        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().add(treeView);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


    public static void main(String[] args) {

        launch(args);
    }



}
