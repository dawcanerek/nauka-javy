package pl.program4.biniek;

import java.nio.channels.IllegalSelectorException;

public class ZapisywaczStanu {

	public ZapisywalnyStrategia zapisywacz;
	
	public void setZapisywacz( ZapisywalnyStrategia zapisywaczOtrzymany){
		zapisywacz = zapisywaczOtrzymany;
	}
	
	public void zapisz(Osoba [] osob){
	
		if (zapisywacz==null){
			throw new IllegalSelectorException();
		}
		zapisywacz.zapis(osob);
	}
	
}
