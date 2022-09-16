package Week_1;

public class ReCapDemo2 {

	public static void main(String[] args) {

		double[] myList = { 3.5, 1.7, 2.6, 7.5 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (number > max) {
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("Toplam: " + total);
		System.out.println("En büyük sayı: " + max);
	}

}
