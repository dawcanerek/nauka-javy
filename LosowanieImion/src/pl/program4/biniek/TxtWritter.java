package pl.program4.biniek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

 public class TxtWritter implements Zapisywacz {
	
	String nazwaPliku = "";
	
	

	public void zapis(Osoba[] nazwy){
		nazwaPliku = "PlikZTablOsob.txt";


		File plik = new File(nazwaPliku);
		
		
		try {	
	    	BufferedWriter bw = new BufferedWriter(new FileWriter(plik));	
			
			
	    	for(int i=0;i<nazwy.length;i++){
	    	   	
	    		bw.write(nazwy[i].toString());
	    		bw.newLine();
			}
			bw.close();
	    } catch(IOException e) {System.out.println("Wystapi³ wyj¹tek txtwritter zapis tablicy osob "+e);}
		System.out.println( "DANE ZAPISANO TXT, tablica osob");
	}

//	stara metodA DO Tablicy STRINGÓW NIE UZYWANA
	/*
	public static void zapis(String [] nazwy){
		nazwaPliku = "PlikZeStringów.txt";


		File plik = new File(nazwaPliku);
		
		
		try {	
	    	BufferedWriter bw = new BufferedWriter(new FileWriter(plik));	
			
			
	    	for(int i=0;i<nazwy.length;i++){
	    	   	
	    		bw.write(nazwy[i]);
	    		bw.newLine();
			}
			bw.close();
	    } catch(IOException e) {System.out.println("Wystapi³ wyj¹tek txtwritter zapis tablicy stringów "+e);}
		JOptionPane.showMessageDialog(new JFrame(), "DANE ZAPISANO TXT, tablica stringow");
	}
	
*/
		
		
		
	}


