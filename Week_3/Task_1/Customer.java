package Week_3.Task_1;

public class Customer {
	
	private int id;
	private String city;
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı.");
	}
	

	public Customer(int id, String city) {
		this.id = id;
		this.city = city;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
}