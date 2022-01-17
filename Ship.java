package sample;

public class Ship implements Runnable {

	private Doc doc;

	private int counter;

	private boolean turn;

	public Ship(int count, Doc doc, boolean turn) {
		super();
		this.counter = count;
		this.turn = turn;
		this.doc = doc;
	}

	public Ship() {
		super();

	}

	@Override
	public void run() {

		doc.unloadShip(counter, turn);

	}

}