package pl.program4.biniek;

public class GeneratorNazw {
	//stara klasa nie uzywana
	int dlugoscDanych = 666;
	
	String [] imiona = {"Adam", "Anna","Xawery", 
			"Jan", "Piotr", "J�zef", 
			"Zenon", "J�zefina", "Hermenegilda"};
	String [] nazwiska = {"Jedynka", "Dw�jka","Tr�jka", 
			"Czw�rka", "Piatka", "Szustka", 
			"Siudemka", "Osemka", "Dziewi�tka"};
	
	public String [] losuj(){
		String [] osoby =new String[dlugoscDanych];
		for (int i=0;i<dlugoscDanych;i++){
			
			osoby[i]=imiona[(int)((imiona.length)*Math.random())]+" ";
			osoby[i]+=nazwiska[(int)((nazwiska.length)*Math.random())];
			System.out.println(osoby[i]);
		}
		
		
		
		
		
		return osoby;
		
		
	}
	
	
	
	

}
