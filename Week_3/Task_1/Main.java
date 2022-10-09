package Week_3.Task_1;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		Customer customer2 = new Person(1, "İzmir", "XXX", "YYY", "12345678911");
		Customer customer3 = new Company(2, "İstanbul", "1237567", "AAA A.Ş.");
		
		CustomerManager customerManager = new CustomerManager(customer2, new MilitaryCreditManager());
	}

}
