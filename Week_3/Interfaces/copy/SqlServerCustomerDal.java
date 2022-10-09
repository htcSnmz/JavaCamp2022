package Week_3.Interfaces.copy;

public class SqlServerCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("Sql Server'e eklendi.");
		
	}

}
