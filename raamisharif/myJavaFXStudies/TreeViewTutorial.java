import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

public class TreeViewTutorial extends Application {

	Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		window.setTitle("A Tree View");
		
		TreeView<String> treeview = new TreeView<String>();
		
		TreeItem<String> root, src, systemLib;
		
		root = new TreeItem<>();
		root.setExpanded(true);
		
		
		treeview.setRoot(root);
		treeview.setShowRoot(false);
		
		src = makeBranch("src", root);
		makeBranch("TreeViewTutorial.java", src);
		makeBranch("ConfirmBox.java", src);
		
		systemLib = makeBranch("JRE System Library", root);
		makeBranch("resources.jar", systemLib);
		makeBranch("A Jar File", systemLib);
		
		treeview.getSelectionModel().selectedItemProperty().addListener((e, old, newi) -> { System.out.println(newi); });
		
		window.setScene(new Scene(treeview));
		window.show();
	}
	
	private TreeItem<String> makeBranch(String branchName, TreeItem<String> parent){
		TreeItem<String> tmp = new TreeItem<>(branchName);
		parent.getChildren().add(tmp);
		return tmp;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
