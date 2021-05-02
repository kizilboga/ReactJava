package ders04Abstract;

public abstract class GameController {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
