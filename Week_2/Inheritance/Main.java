package Week_2.Inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.age = 17;
		employee.age = 21;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.list();
		customerManager.list();
		employeeManager.bestEmployee();
	}

}
