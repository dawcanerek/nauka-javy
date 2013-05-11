package pl.program4.biniek;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WyborMetodyZapisu {
	String odczyt = "";

	// @Override
	public void readInTekst(Osoba[] osob) {

		Scanner in = new Scanner(System.in);

		System.out
				.println("Wybierz metode zapisu 1 to XML, ka¿da inna to TXT ");
		
		odczyt = in.nextLine();
		
		in.close();

	if (odczyt.equals("1")) {
		System.out.println("t0");
			XmlWritter zap = new XmlWritter();
			System.out.println("t1");
			zap.zapis(osob);
		} else {
			TxtWritter zap = new TxtWritter();
			zap.zapis(osob);
		}
		System.out.println("t2");
	}

}
