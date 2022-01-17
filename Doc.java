package sample;

public class Doc {

	private boolean queue;

	public Doc(boolean queue) {
		super();
		this.queue = queue;
	}

	public Doc() {
		super();

	}

	public synchronized void unloadShip (int counter, boolean queue) {

		for (; this.queue == queue;) {

			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		for (int i = 10; i > 0; i--) {

			counter = counter - 1;
			try {

				wait(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.print(counter + "-");

		}

		this.queue =! this.queue;

		notify();

	}
}
