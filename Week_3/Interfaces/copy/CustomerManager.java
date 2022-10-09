package Week_3.Interfaces.copy;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		//iş kodları...
		customerDal.add();
	}
}
