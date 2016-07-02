import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewTutorial extends Application {

	Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("A Table View");
		
		TableView<Product> table = new TableView<>();
		
		
		//Set up Columns
		
		TableColumn<Product, String> name = new TableColumn<>("Name: ");
		name.setMinWidth(200);
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<Product, Integer> quantity = new TableColumn<>("Quantity: ");
		quantity.setMinWidth(200);
		quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		TableColumn<Product, Double> price = new TableColumn<>("Price: ");
		price.setMinWidth(200);
		price.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		
		//Set up Table
		table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		table.setItems(getProducts());
		table.getColumns().addAll(name, quantity, price);
		
		
		//Set up Input
		TextField txtName = new TextField();
		txtName.setPromptText("Product Name");
		TextField txtQuantity = new TextField();
		txtQuantity.setPromptText("Product Quantity");
		TextField txtPrice = new TextField();
		txtPrice.setPromptText("Product Price");
		Button btnsubmit = new Button("Add");
		btnsubmit.setOnAction(e -> {
			String n = txtName.getText();
			int q = Integer.parseInt(txtQuantity.getText());
			double p = Double.parseDouble(txtPrice.getText());
			table.getItems().add(new Product(n,q,p));
			txtName.clear();
			txtQuantity.clear();
			txtPrice.clear();
		});
		
		Button btnDelete = new Button("Delete");
		btnDelete.setOnAction(e -> {
			ObservableList<Product> selected = table.getSelectionModel().getSelectedItems();
			table.getItems().removeAll(selected);
		});
		
		
		HBox inputLayout = new HBox(5);
		inputLayout.getChildren().addAll(txtName, txtQuantity, txtPrice, btnsubmit, btnDelete);
		
		inputLayout.setPadding(new Insets(20,20,20,20));
		
		//Set up Layout
		VBox layout = new VBox();
		layout.getChildren().addAll(table,inputLayout);
		
		
		Scene scene = new Scene(layout);
		
		//finalize Window
		window.setScene(scene);
		
		window.show();
	}

	private ObservableList<Product> getProducts(){
		ObservableList<Product> tmp = FXCollections.observableArrayList();
		tmp.add(new Product("Movie", 100, 19.99));
		tmp.add(new Product("TV", 20, 799.99));
		tmp.add(new Product("Video Game", 50, 59.99));
		tmp.add(new Product("Computer", 40, 699.99));
		return tmp;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public class Product{
		private String name;
		private int quantity;
		private double price;
		
		public Product(){
			this.name = "";
			this.quantity = 0;
			this.price = 0;
		}
		
		public Product(String name, int quantity, double price){
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
	}

}
