package Week_2.ClassesWithAttributes;

public class ProductManager {
	public void add(Product product) {
		// JDBC ile ilerde kaydedilecek.
		System.out.println(product.getName() + " ürünü eklendi.");

	}

	
	// Hatalı kullanım.
	public void add2(int id, String name, String description, double price, int stockAmount, String color) {

	}
}
