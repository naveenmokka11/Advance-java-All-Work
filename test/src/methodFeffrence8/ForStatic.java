package methodFeffrence8;

import java.util.Iterator;

public class ForStatic {

	public static void m1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("child thead");

		}
	}

	public static void main(String[] args) {

		Runnable r = ForStatic::m1;
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {

			System.out.println("Main thread");
		}

	}

}
