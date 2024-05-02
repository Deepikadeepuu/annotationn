package initialize;

public class Car1 {
private String brand;
private int price;
private String color;
@Override
public String toString() {
	return "Car1 [brand=" + brand + ", price=" + price + ", color=" + color + "]";
}


public void setBrand(String brand) {
	this.brand = brand;
}

public void setPrice(int price) {
	this.price = price;
}


public void setColor(String color) {
	this.color = color;
}


public Car1(String brand, int price, String color) {
	super();
	this.brand = brand;
	this.price = price;
	this.color = color;
}





}
