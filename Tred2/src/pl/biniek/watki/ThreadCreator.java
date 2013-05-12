package pl.biniek.watki;

import java.io.File;

public class ThreadCreator {
	Integer[] ileLinii;
	MyThread[] mt;

	public void start(String path) {

		File fil = new File(path);
		System.out.println(" sciezka " + path);
		File[] paths = fil.listFiles();
		ileLinii = new Integer[paths.length];
		mt = new MyThread[paths.length];
		for (int i = 0; i < paths.length; i++) {
			System.out.println("watek " + i + " sciezka " + paths[i]);
			mt[i] = new MyThread(paths[i]);
			mt[i].start();
			// mt.getLiczbaLinii()

		}
		for (int j = 0; j < mt.length; j++) {

			try {
				mt[j].join();
			} catch (InterruptedException e) {
				System.out.println("Wystapi³ wyj¹tek w synchronizacji " + e);// TODO
				e.printStackTrace();
			}
		}
	}

	public int getAllLines() {
		int linie = 0;
		for (int i = 0; i < mt.length; i++) {
			linie += mt[i].getLiczbaLinii();
		}

		return linie;

	}

}
