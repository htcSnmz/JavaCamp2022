package Week_3.oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logged to file: " + message);
		
	}

}
