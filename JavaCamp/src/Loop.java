
public class Loop {

	public static void main(String[] args) {

		// For Döngüsü

		for (int i = 1; i <= 10; i += 2) {

			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Döngü Bitti");

		System.out.println("-----------------------------");
		
		for (int i = 1; i < 100; i++) {

			if (i % 7 == 0) {
				System.out.println(i + " " + " 7'ye bölünebilen bir sayýdýr.");
			}

		}

		System.out.println("-----------------------------");
		
		// While Döngüsü
      
		int i =10;
		while(i>2) {
			System.out.println("Sayýlar = "+i);
		      i--;   	
	
				System.out.println("-----------------------------");
		      
		// Do-while - çok kullanýlmayan
		      
				int sayi=23;;
				
		      do {
		    	  System.out.println("Loglandý.");
		    	  System.out.println(sayi);
		    	  sayi-=1;
		    	  
		      }while(23<sayi);
		
		// ikisi arasýndaki fark: while þart saðlanmazsa iþlemlere girmez.
		// Do-while döngüsünde ilk önce iþlemler geldiði için bir kere çalýþacaktýr.      
		
		}
		
	}

}
