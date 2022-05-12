package entities;

public class Product {

	
		public String name;
		public double price;
		public int quantity; 

	public double totalValueInStock(){
		//calcula a o valor em estoque
		return price * quantity;
	}
	public void addProducts(int quantity) {
		//adiciona novos produtos ao estoque
		this.quantity += quantity; 
		
	}
	public void removeProduct(int quantity) {
		//remove produtos do estoque
		this.quantity -= quantity;
	}
	public String toString() {
		return name 
			+", "
			+" $ "
			+ String.format("%.2f", price)
			+", "
			+quantity
			+" units, "
			+"Total: "
			+" $ "
			+String.format("%.2f", totalValueInStock());
			
				
	}
}
