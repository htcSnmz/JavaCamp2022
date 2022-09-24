package Week_2.InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(ogretmenKrediManager);
		

	}

}
