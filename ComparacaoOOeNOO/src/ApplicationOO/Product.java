package ApplicationOO;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
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
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
	    this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		if(this.quantity < 0)
			this.quantity = 0;
	}
}
