package Week_3.Interfaces.copy;

public class Main {

	public static void main(String[] args) {
		
		//ICustomerDal customerDal = new OracleCustomerDal();
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();

	}

}
