
public class Proje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char karakter = 'Ý';
		
		
		
		switch(karakter) {
		
		case 'A':case 'I':case 'O':case 'U':
			System.out.println("Girilen harf kalýn sesli bir harf");
          break;
		case 'E':case 'Ý':case 'Ö':case 'Ü':
		System.out.println("Girilen harf ince sesli bir harf.");
		break;
		
		default: System.out.println("Geçersiz bir harf giriþi.");
		}
		
		
	}

}
