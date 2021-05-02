package ders04Abstract;

public class Main {

	public static void main(String[] args) {

		GameController[] gameControllers = { new ManGameController(), new WomanGameController(),
				new KidsGameController() };

		for (GameController gameController : gameControllers) {
			gameController.hesapla();
		}

		GameController[] gameControllersOver = { new ManGameController(), new WomanGameController(),
				new KidsGameController() };

		for (GameController gameController : gameControllersOver) {
			gameController.gameOver();
		}
	
	}

}
