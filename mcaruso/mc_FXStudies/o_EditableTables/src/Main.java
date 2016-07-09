import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage window;
	TableView<Products> productsTable;
	TextField nameInput, priceInput, quantityInput; 
	
	public static void main(String[] args) {
		launch(args);

	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		window.setTitle("FX TableView Demo");
		
		// set up columns for table
		//name column
		TableColumn<Products, String> nameCol = new TableColumn<>("Name");
		nameCol.setMinWidth(200);
		
		//use this data for this column
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		//Price col
		TableColumn<Products, Double> priceCol = new TableColumn<>("Price");
		priceCol.setMinWidth(100);
		priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
	
		//Quantity Col
		TableColumn<Products, Integer> quantityCol = new TableColumn<>("Quantity");
		quantityCol.setMinWidth(100);
		quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		//nameInput
		nameInput = new TextField();
		nameInput.setPromptText("Product Name");
		nameInput.setMinWidth(125);
		
		//price input
		priceInput = new TextField();
		priceInput.setPromptText("Product Price");
		priceInput.setMinWidth(125);
		
		//quantity input
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantity");
		quantityInput.setMinWidth(125);
		
		//add and delete buttons
		Button addButton = new Button("Add");
		addButton.setOnAction( e -> addButtonClicked());
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction( e -> deleteButtonClicked());
		
		//Make horizontal layout for inputs and buttons
		HBox hbox = new HBox(); 
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(10);
		hbox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);
		
		
		
		//build the table
		productsTable = new TableView<>();
		productsTable.setItems(getProducts());
		productsTable.getColumns().addAll(nameCol, priceCol, quantityCol);
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(productsTable, hbox);
		
		Scene scene = new Scene(layout, 800, 400);
		window.setScene(scene);
		window.show();
	}
	
	// add button clicked method
	public void addButtonClicked(){
		Products product = new Products();
		product.setName(nameInput.getText());
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantityInput.getText()));
		// add to table
		productsTable.getItems().add(product);
		
		//clear input fields
		nameInput.clear();
		priceInput.clear();
		quantityInput.clear();
		
	}
	
	//delete button method
	public void deleteButtonClicked(){
		ObservableList<Products> selectedProduct, allProducts;
		allProducts = productsTable.getItems();
		selectedProduct = productsTable.getSelectionModel().getSelectedItems();
		selectedProduct.forEach(allProducts :: remove);
	}

	//Get all the products, usually some kind of DB
	public ObservableList<Products> getProducts(){
		
		ObservableList<Products> products = FXCollections.observableArrayList();
		products.add(new Products("Gibson SG", 1500.00, 20));
		products.add(new Products("Gibson Les Paul", 2500.00, 10));
		products.add(new Products("Epiphone EX", 900.99, 40));
		products.add(new Products("Martin D100", 3050.67, 15));
		products.add(new Products("Martin D18", 4500.00, 8));
		
		return products; 
	}
	
	
	
	
}
