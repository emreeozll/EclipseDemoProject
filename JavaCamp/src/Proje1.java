
public class Proje1 {

	public static void main(String[] args) {
		// Asal Say� Bulma

		int number = 1;
		boolean durum = true;

		for (int i = 2; i < number; i++) {
			if (number%i == 0) {
				 durum = false;
		
		System.out.println("Say�n�n b�lenleri: "+i+" ");
				 
			}
		}
		
		if(number==1) {
			
			System.out.println("Ge�ersiz say�");
			return;
		}
		
		if(number<2) {
			System.out.println("Ge�ersiz Say�");
		}
		
        if(durum){
        	System.out.println("Say� asald�r.");
        }else {System.out.println("Say� asal de�ildir");}
		
		
		
	}

}
