package pl.program4.biniek;

public class ProgramImiona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GeneratorNazw gn = new GeneratorNazw();
		//TxtWritter.zapis(gn.losuj());
		
		GeneratorOsob go = new GeneratorOsob();
		Osoba []os=(go.losuj());
		WyborMetodyZapisu wmz = new WyborMetodyZapisu();
		wmz.readInTekst(os);
	}

}
