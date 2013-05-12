package pl.biniek.watki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	File plik;
	//String file;

	public MyFileReader(File file) {
		
		plik = file;
	}

	public int ileLinii() {
		int i = 0;
		System.out.println("klasa myFileReader sciezka"+plik.getAbsolutePath());
		try {
			BufferedReader br = new BufferedReader(new FileReader(plik));
			while (br.readLine() != null) {
				i++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Wystapi³ wyj¹tek odczytu pliku" + e);
		}
		System.out.println("DANE odczytano");

		return i;
	}

}
