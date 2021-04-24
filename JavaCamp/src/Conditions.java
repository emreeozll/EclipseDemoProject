
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int not = 49;
		if(not>=50){
			System.out.println("Ders Durumu : Baþarýlý");
			}else {
				System.out.println("Ders Durumu : Baþarýsýz ");
			}
		
		
		System.out.println("----------------------------");
		
		
		
        int sayi = 19;
		if(sayi<19){
			System.out.println("Sayi 20'den küçüktür.");
		}else if(sayi<19) {
			System.out.println("Sayý 19'dan büyüktür.");
		}
		else {
			System.out.println("Sayý 19 deðerine eþittir.");
		}
		
		
	System.out.println("-------------------------------------------");
	
	char grade = 'Z';

	switch (grade) {

	case 'A':
		System.out.println("Mükemmel Geçtiniz.");
		break;
	case 'B':
		System.out.println("Çok iyi geçtiniz.");
		break;
	case 'C':
		System.out.println("Ýyi geçtiniz.");
	case 'F':
	case 'Z':
		System.out.println("Kaldýnýz");
		break;
	default:
		System.out.println("Geçersiz not girdiniz.");
	}
		
	}

}
