package pl.biniek.watki;

public class Watek2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path =  "D:\\testkatalog";
		System.out.println(path);
		ThreadCreator tc= new ThreadCreator();
		tc.start(path);
		System.out.println("LICZBA LINII WE WSZYSTKICH PLIKACH   "+tc.getAllLines());
		
		
	}

}
