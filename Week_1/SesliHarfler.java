package Week_1;

public class SesliHarfler {

	public static void main(String[] args) {

		char letter = 'i';

		switch (letter) {
			case 'A':
			case 'a':
			case 'I':
			case 'ı':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println("Kalın sesli harf.");
				break;
			default:
				System.out.println("İnce sesli harf.");
		}

	}

}
