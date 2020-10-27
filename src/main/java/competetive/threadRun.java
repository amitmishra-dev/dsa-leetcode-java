package competetive;

public class threadRun implements Runnable {

	public void run() {
		System.out.println("run");

	}

	public static void main(String[] args) {
		Thread t = new Thread(new threadRun());
		t.run();
		t.run();
		t.start();

	}

}
