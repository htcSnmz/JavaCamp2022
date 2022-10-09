package Week_3.Task_1;

public class CustomerManager {
	
	private ICreditManager creditManager;
	private Customer customer;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri kaydedildi.");
	}
	
	public void delete() {
		System.out.println("Müşteri silindi.");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi.");
	}
}
