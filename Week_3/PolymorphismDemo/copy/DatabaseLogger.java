package Week_3.PolymorphismDemo.copy;

public class DatabaseLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to database: " +  message);
	}
}
