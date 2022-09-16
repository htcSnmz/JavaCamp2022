package Week_1;

public class ArkadasSayilar {

	public static void main(String[] args) {

		int number1 = 222, number2 = 284, total1 = 0, total2 = 0;

		if (number1 < 2 || number2 < 2) {
			System.out.println("Geçersiz sayı girildi.");
			return;
		} else {
			for (int i = 1; i <= ((int) (number1 / 2)); i++) {
				if (number1 % i == 0) {
					total1 += i;
				}
			}
			for (int i = 1; i <= ((int) (number2 / 2)); i++) {
				if (number2 % i == 0) {
					total2 += i;
				}

			}
		}

		if (number1 == total2 && number2 == total1) {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayıdır.");
		} else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayı değildir.");
		}
	}
}
