
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int not = 49;
		if(not>=50){
			System.out.println("Ders Durumu : Ba�ar�l�");
			}else {
				System.out.println("Ders Durumu : Ba�ar�s�z ");
			}
		
		
		System.out.println("----------------------------");
		
		
		
        int sayi = 19;
		if(sayi<19){
			System.out.println("Sayi 20'den k���kt�r.");
		}else if(sayi<19) {
			System.out.println("Say� 19'dan b�y�kt�r.");
		}
		else {
			System.out.println("Say� 19 de�erine e�ittir.");
		}
		
		
	System.out.println("-------------------------------------------");
	
	char grade = 'Z';

	switch (grade) {

	case 'A':
		System.out.println("M�kemmel Ge�tiniz.");
		break;
	case 'B':
		System.out.println("�ok iyi ge�tiniz.");
		break;
	case 'C':
		System.out.println("�yi ge�tiniz.");
	case 'F':
	case 'Z':
		System.out.println("Kald�n�z");
		break;
	default:
		System.out.println("Ge�ersiz not girdiniz.");
	}
		
	}

}
