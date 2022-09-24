package Week_2.ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 2, "Black");
		
		/*
		product.name = "Laptop";
		product.id = 1;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		product.color = "grey";
		
		*/
		
		//System.out.println(product.name);
		
		
		/*
		product.setName("Laptop");
		product.setId(1);
		product.setColor("black");
		
		System.out.println(product.getCode());
		
		*/
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
