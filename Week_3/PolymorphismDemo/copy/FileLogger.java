package Week_3.PolymorphismDemo.copy;

public class FileLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to file: " +  message);
	}
}
