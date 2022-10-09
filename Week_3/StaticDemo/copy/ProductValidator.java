package Week_3.StaticDemo.copy;

public class ProductValidator {
	static {
		System.out.println("Statik Yapıcı Blok Çalıştı");
	}
	
	static {
		System.out.println("Statik Yapıcı Blok Çalıştı2");
	}
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {	
			return true;
		}else {
			return false;
		}
	}
	
	
	//inner class
	public static class AnotherClass{
		public static void sil() {
			
		}
	}
}
