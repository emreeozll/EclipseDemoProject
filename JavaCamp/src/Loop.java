
public class Loop {

	public static void main(String[] args) {

		// For D�ng�s�

		for (int i = 1; i <= 10; i += 2) {

			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("D�ng� Bitti");

		System.out.println("-----------------------------");
		
		for (int i = 1; i < 100; i++) {

			if (i % 7 == 0) {
				System.out.println(i + " " + " 7'ye b�l�nebilen bir say�d�r.");
			}

		}

		System.out.println("-----------------------------");
		
		// While D�ng�s�
      
		int i =10;
		while(i>2) {
			System.out.println("Say�lar = "+i);
		      i--;   	
	
				System.out.println("-----------------------------");
		      
		// Do-while - �ok kullan�lmayan
		      
				int sayi=23;;
				
		      do {
		    	  System.out.println("Logland�.");
		    	  System.out.println(sayi);
		    	  sayi-=1;
		    	  
		      }while(23<sayi);
		
		// ikisi aras�ndaki fark: while �art sa�lanmazsa i�lemlere girmez.
		// Do-while d�ng�s�nde ilk �nce i�lemler geldi�i i�in bir kere �al��acakt�r.      
		
		}
		
	}

}
