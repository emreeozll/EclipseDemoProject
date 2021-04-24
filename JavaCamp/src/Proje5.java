
public class Proje5 {

	public static void main(String[] args) {
		// Sayý Bulma
		
		
		int sayýlar [] = new int [] {1,2,5,7,9,0,6,};
        int aranan = 5;
        boolean durum= false;
        
        for(int i = 0; i<sayýlar.length; i++) {
        	
        	if(aranan==sayýlar[i]){
                     durum=true; 
                     break;
        	}
        	
        }
		
        if(durum) {
        	System.out.println("Aranan sayý mevcuttur.");
        }else {System.out.println("Aranan sayý mevcut deðildir!!!");}
        
		
		
	}

}
