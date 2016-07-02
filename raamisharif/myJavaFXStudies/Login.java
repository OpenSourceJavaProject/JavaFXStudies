import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application {

	Stage window;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		window.setTitle("Login");
		
		Person raami = new Person();
		raami.setFirstName("Raami");
		
		raami.firstNameProperty().addListener((v,old,newval) -> { 
			System.out.println(old);
			System.out.println(newval);
		});
		
		
		
		TextField userName = new TextField();
		userName.setPromptText("Username");
		
		PasswordField pass = new PasswordField();
		pass.setPromptText("Password");
		
		Button login = new Button("Login");
		login.getStyleClass().add("button-login");
		
		
		Button signup = new Button("Sign Up");
		signup.getStyleClass().add("button-signup");
		signup.setOnAction(e -> {
			raami.setFirstName(userName.getText());
		});
		
		
		VBox layout = new VBox(4);
		layout.setPadding(new Insets(20,20,20,20));
		
		HBox buttons = new HBox(3);
		buttons.getChildren().addAll(login,signup);
		layout.getChildren().addAll(userName,pass,buttons);
		
		Scene scene = new Scene(layout);
		scene.getStylesheets().add("styles.css");
		window.setScene(scene);
		window.show();
	}
	
	public class Person{
		
		private StringProperty firstName = new SimpleStringProperty(this,"firstName","");
		
		public StringProperty firstNameProperty(){
			return firstName;
		}
		
		public String getFirstName(){
			return firstName.get();
		}
		
		public void setFirstName(String firstName){
			this.firstName.set(firstName);
			
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	

}
