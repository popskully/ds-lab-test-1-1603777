//Davian Lounds | 1603777 | 19/02/2020
public class Driver {
	
//	private static final char[][] Shoe = null;

	public Driver() {
		Shoe shoes[] = new Shoe[10]; //Array of ten shoes
	}
	
	public static void main(String args[]) {
		Shoe shoes = new Shoe(0, null, 0, null);
		
		for(int i=0; i<10; i++) { //loop through array and display all contents
			
			System.out.println(new Shoe[i]); 
		}
	}
}
