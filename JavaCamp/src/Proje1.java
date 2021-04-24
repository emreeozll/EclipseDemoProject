
public class Proje1 {

	public static void main(String[] args) {
		// Asal Sayý Bulma

		int number = 1;
		boolean durum = true;

		for (int i = 2; i < number; i++) {
			if (number%i == 0) {
				 durum = false;
		
		System.out.println("Sayýnýn bölenleri: "+i+" ");
				 
			}
		}
		
		if(number==1) {
			
			System.out.println("Geçersiz sayý");
			return;
		}
		
		if(number<2) {
			System.out.println("Geçersiz Sayý");
		}
		
        if(durum){
        	System.out.println("Sayý asaldýr.");
        }else {System.out.println("Sayý asal deðildir");}
		
		
		
	}

}
