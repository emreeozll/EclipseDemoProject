
public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String iller [] [] = new String [3][3]; 
		
		iller [0] [0] = "�stanbul";
		iller [0] [1] = "Canakakle";
		iller [0] [2] = "Sakarya";
		iller [1] [0] = "Kastamonu";
		iller [1] [1] = "Ordu";
		iller [1] [2] = "Trabzon";
		iller [2] [0] = "�zmit";
		iller [2] [1] = "�zmir";
		iller [2] [2] = "Ayd�n";
		
		
		for(int i=0; i<iller.length; i++) {
			System.out.println("------------------------- ");
			for(int j=0; j<iller.length;j++) {
				
				System.out.println(iller[i][j]);
			}
			
		}
		
		
		
	}

}
