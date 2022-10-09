package Week_3.AbstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		databaseManager.getData();
	}
}
