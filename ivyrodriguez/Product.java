package JavaFXDemo;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){ //one way to construct the objects and sets their values
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity){ //other way to construct the objects and sets their values
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //right click, select generate, then Getter and Setter and the IntelliJ IDE will create the below code

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}