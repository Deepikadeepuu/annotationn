package initialize;

public class Bus1 {
private String brand;
private int price;
private String color;
public Bus1(String brand, int price, String color) {
	super();
	this.brand = brand;
	this.price = price;
	this.color = color;
}
@Override
public String toString() {
	return "Bus1 [brand=" + brand + ", price=" + price + ", color=" + color + "]";
}


}
