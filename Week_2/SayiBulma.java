package Week_2;

public class SayiBulma {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] { 10, 23, 54, 7, 9, 0, 100 };
		int aranacakSayi = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				System.out.println(aranacakSayi + " dizinin içinde.");
				varMi = true;
				break;
			}
		}
		if (!varMi) {
			System.out.println(aranacakSayi + " dizinin içinde değil.");
		}

	}

}
