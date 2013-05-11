package pl.program4.biniek;

public class Osoba {

	String imie;
	String nazwisko;
	
	public Osoba (String imie, String nazwisko){
		this.imie=imie;
		this.nazwisko=nazwisko;
				
	}
	
	public String getImie(){
		return imie;
	}
	
	public String getNazwisko(){
		return nazwisko;
	}
	
	public void setImie(String im){
		imie=im;
	}
	
	public void setNazwisko(String na){
		nazwisko=na;
	}
	
	public String toString(){
		String dane=imie+" "+nazwisko;
		return dane;
	}
	
}
