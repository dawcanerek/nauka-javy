package pl.biniek.watki;

import java.io.File;

public class MyThread extends Thread {
	int liczbaLinii;
	File path;
	public MyThread(File path){
		this.path=path;
	}
		
		public void run(){
			MyFileReader mfr=new MyFileReader(path);
			liczbaLinii=mfr.ileLinii();
			System.out.println("plik: "+path+" liczba linii "+liczbaLinii);
			
		}
		
		public int getLiczbaLinii(){
			return liczbaLinii;
		}
	}
	

