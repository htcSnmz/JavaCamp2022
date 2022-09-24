package Week_2;

public class Main {

	public static void main(String[] args) {
		
		// Reference type.    
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		// Garbage collector bellekten new CustomerManager()'ı silecek.
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
	}

}
