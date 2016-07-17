import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	private StringProperty firstname = new SimpleStringProperty(this, "firstname"," ");

	
	//default no args constructor
	public Person(){
		
	}
	
	// returns the new SimpleStringProperty() object
		public StringProperty firstNameProperty() {
		
		return firstname;
	}
		
	// return firstname value
	public String getFirstname() {
		return firstname.get();
	}

	//sets the value of firstname
	public void setFirstname(String firstname){
		this.firstname.set(firstname);
	}

}
