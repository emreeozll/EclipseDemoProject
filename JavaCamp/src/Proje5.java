
public class Proje5 {

	public static void main(String[] args) {
		// Say� Bulma
		
		
		int say�lar [] = new int [] {1,2,5,7,9,0,6,};
        int aranan = 5;
        boolean durum= false;
        
        for(int i = 0; i<say�lar.length; i++) {
        	
        	if(aranan==say�lar[i]){
                     durum=true; 
                     break;
        	}
        	
        }
		
        if(durum) {
        	System.out.println("Aranan say� mevcuttur.");
        }else {System.out.println("Aranan say� mevcut de�ildir!!!");}
        
		
		
	}

}
