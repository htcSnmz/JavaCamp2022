package Week_2;

public class DeğerVeReferansTipler {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int[] sayilar1 = {1, 2, 3};
		int[] sayilar2 = new int[]{4, 5, 6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}

}
