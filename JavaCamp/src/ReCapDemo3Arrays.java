
public class ReCapDemo3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		double liste [] = {2.3,5.5,36.2,6.45};
		float toplam = 0;
		double min=liste[2];
		
		for(int i=0; i<liste.length; i++) {
		
		if(min>liste[i]){
			
			min= liste[i];
		}
			
			System.out.println(liste[i]);
			toplam+=liste[i];
		
			
		}
		
		System.out.println("Listeki sayýlarýn toplamý="+toplam);
		System.out.println("Dizideki en küçük sayý="+min);
		
		
		
		
		
	}

}
