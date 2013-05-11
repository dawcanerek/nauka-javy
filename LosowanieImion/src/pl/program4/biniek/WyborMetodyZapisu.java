package pl.program4.biniek;

import java.util.Scanner;

public class WyborMetodyZapisu {
	String odczyt = "";
	ZapisywaczStanu zs = new ZapisywaczStanu();

	// @Override
	public void readInTekst(Osoba[] osob) {

		Scanner in = new Scanner(System.in);

		System.out
				.println("Wybierz metode zapisu 1 to XML, ka¿da inna to TXT ");

		odczyt = in.nextLine();

		in.close();

		if (odczyt.equals("1")) {
			zs.setZapisywacz(new XmlWritter());
		} else {
			zs.setZapisywacz(new TxtWritter());
		}
		zs.zapisz(osob);
	}

}
