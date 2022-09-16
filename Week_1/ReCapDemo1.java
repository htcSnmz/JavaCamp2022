package Week_1;

public class ReCapDemo1 {

	public static void main(String[] args) {

		int number1 = 27;
		int number2 = 5;
		int number3 = 85;
		int maxNumber = number1;

		if (maxNumber < number2) {
			maxNumber = number2;
		}

		if (maxNumber < number3) {
			maxNumber = number3;
		}

		System.out.println("En büyük: " + maxNumber);

	}

}
