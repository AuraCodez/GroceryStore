public class Item implements Comparable<Item> {
	private String name;
	private double price;
	private int quantity;
	
	//public static void main(String [] args) {
		//Item item = new Item("Apple", 0.99, 10);
		//System.out.println(item.inStock());
		//Item idk = new Item("Chips", 0.54, 32);
		//System.out.println(idk.getTotalPrice());
		//System.out.println(idk.toString());
	//}
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void increasePrice(int amount) {
		this.price += amount;
	}
	
	public void decreasePrice(int amount) {
		this.price -= amount;
	}
	
	public int getStock() {
		return this.quantity;
	}
	
	public void increaseStock(int amount) {
		this.quantity += amount;
	}
	
	public void decreaseStock(int amount) {
		this.quantity -= amount;
	}
	
	public void goneBad() {
		this.quantity = 0;
	}
	
	public boolean inStock() {
		if(this.quantity > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean inStockName(String name) {
	    return this.name.equals(name) && this.quantity > 0;
	}
	
	public void setStock(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getTotalPrice() {
		double price = this.price * quantity;
		return price;
	}
	
	@Override
	public String toString() {
		return "Item: " + this.getName() + " " + " Price: " + this.getPrice() + " " + " Stock: " + this.getStock();
	}

	@Override
	public int compareTo(Item other) {
		return this.name.compareTo(other.getName());
	}
}
