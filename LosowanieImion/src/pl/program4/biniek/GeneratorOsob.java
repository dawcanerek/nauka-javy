package pl.program4.biniek;

public class GeneratorOsob {
	
	int dlugoscDanych = 666;
	
	String [] imiona = {"Adam", "Anna","Xawery", 
			"Jan", "Piotr", "J�zef", 
			"Zenon", "J�zefina", "Hermenegilda"};
	String [] nazwiska = {"Jedynka", "Dw�jka","Tr�jka", 
			"Czw�rka", "Piatka", "Szustka", 
			"Siudemka", "Osemka", "Dziewi�tka"};

	
	
	
	public Osoba [] losuj(){
		Osoba  [] osoby =new Osoba[dlugoscDanych];
		for (int i=0;i<dlugoscDanych;i++){
			
			osoby[i]=new Osoba (imiona[(int)((imiona.length)*Math.random())], 
			nazwiska[(int)((nazwiska.length)*Math.random())]);
			
			System.out.println(osoby[i].getImie()+" "+osoby[i].getNazwisko());
		}
		
		
		
		return osoby;
		
		
	}
	
	
	

}
