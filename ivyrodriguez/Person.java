import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//JavaFX allows you to make the property its own object, this way we can place listeners on it

public class Person {

    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    //Returns the StringProperty object
    public StringProperty firstNameProperty() {
        return firstName;
    }

    //Return the firstName value (ie. "Bucky")
    public String getFirstName() {
        return firstName.get();
    }

    //Set the firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }


}
