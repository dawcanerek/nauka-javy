package pl.program4.biniek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class XmlWritter implements Zapisywacz {

	String nazwaPliku = "";

	String imie;
	String nazwisko;
	int spacja = 0;

	public void zapis(Osoba[] nazwy) {
		nazwaPliku = "PliczekXMLZOsob.xml";

		File plik = new File(nazwaPliku);

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(plik));

			for (int i = 0; i < nazwy.length; i++) {

				bw.write("<osoba><imie>" + nazwy[i].getImie()
						+ "</imie><nazwisko>" + nazwy[i].getNazwisko()
						+ "</nazwisko>");
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out
					.println("Wystapi³ wyj¹tek xmlwritter zapis tablicy osob "
							+ e);
		}
		System.out.println("DANE ZAPISANO XML, tablica osob");
	}

	// stara metodA DO LISTY STRINGÓW NIE UZYWANA
	/*
	 * public static void zapis(String [] nazwy){ nazwaPliku =
	 * "PliczekXMLZeStringow.xml";
	 * 
	 * File plik = new File(nazwaPliku);
	 * 
	 * try { BufferedWriter bw = new BufferedWriter(new FileWriter(plik));
	 * 
	 * 
	 * for(int i=0;i<nazwy.length;i++){ spacja=nazwy[i].indexOf(' '); imie =
	 * nazwy[i].substring(0,spacja); nazwisko = nazwy[i].substring(spacja,
	 * nazwy[i].length()-1);
	 * bw.write("<osoba><imie>"+imie+"</imie><nazwisko>"+nazwisko+"</nazwisko>"
	 * ); bw.newLine(); } bw.close(); } catch(IOException e)
	 * {System.out.println(
	 * "Wystapi³ wyj¹tek xmltwritter zapis tablicy stringów "+e);}
	 * JOptionPane.showMessageDialog(new JFrame(),
	 * "DANE ZAPISANO XML, tablica stringow"); }
	 */
}
