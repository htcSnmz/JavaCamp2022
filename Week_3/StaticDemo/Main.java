package Week_3.StaticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "";
		productManager.add(product);
		
		DatabaseHelper.Connection.createConnection();

	}

}
