package Week_3.AbstractClasses.copy;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
