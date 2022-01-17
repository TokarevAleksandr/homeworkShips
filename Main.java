package sample;

public class Main {

	public static void main(String[] args) {

		Doc doc = new Doc();

		Ship ship1 = new Ship(10, doc, false);

		Ship ship2 = new Ship(10, doc, true);

		Ship ship3 = new Ship(10, doc, true);

		Thread thread1 = new Thread(ship1);

		Thread thread2 = new Thread(ship2);

		Thread thread3 = new Thread(ship3);

		thread1.start();

		thread2.start();

		thread3.start();
	}

}