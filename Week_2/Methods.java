package Week_2;

public class Methods {
	
	public static void main(String[] args) {
		
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] { 10, 23, 54, 7, 9, 0, 100 };
		int aranacakSayi = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				mesajVer(aranacakSayi + " dizinin içindedir.");
				varMi = true;
				break;
			}
		}
		if (!varMi) {
			mesajVer(aranacakSayi + " dizinin içinde değildir.");
		}

	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
