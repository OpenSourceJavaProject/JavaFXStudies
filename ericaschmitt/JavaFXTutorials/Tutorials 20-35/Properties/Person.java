package properties;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Person {
    private StringProperty name = new SimpleStringProperty(this,"name","");

    public String getName() {
        return name.get(); //.get to actually retrieve the value form this property/ which                                     //now acts as an object
    }

    public void setName(String value) {
        name.set(value);//same way here we use these old and familiar get() and set()
    }
    public StringProperty nameProperty() {
        return name;
    }
 }
