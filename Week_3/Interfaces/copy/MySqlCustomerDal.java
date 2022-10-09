package Week_3.Interfaces.copy;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("MySql'e eklendi.");
		
	}
	
}
