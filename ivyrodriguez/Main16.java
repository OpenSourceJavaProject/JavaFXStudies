package JavaFXDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main16 extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("JavaFX - thenewboston");

        TreeItem<String> root, bucky, megan; // root and branches go here

        //Root
        root = new TreeItem<>();
        root.setExpanded(true); //So that user doesn't have to expand root to see branches

        //Bucky
        bucky = makeBranch("Bucky", root); //two parameters: branch name, it's parent
        makeBranch("thenewboston", bucky); //two parameters: item name, it's parent
        makeBranch("YouTube", bucky);
        makeBranch("Chicken", bucky);

        //Megan
        megan = makeBranch("Megan", root);
        makeBranch("Glitter", megan);
        makeBranch("Makeup", megan);

        //Create the tree and hide the main Root
        tree = new TreeView<>(root);
        tree.setShowRoot(false); //hide a root with no item it in
        tree.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> {//adds a listener to the item so when user clicks, it fires off
                    if (newValue != null)
                        System.out.println(newValue.getValue());
                });

        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree); //different for treeview object
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //Create branches
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item; //method that adds the items noted above and the branches
    }


}

