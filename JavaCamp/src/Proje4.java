
public class Proje4 {

	public static void main(String[] args) {
		// Arkadaþ Sayý

		int sayi1 = 220, sayi2 = 284;
		int toplam = 0;
		int toplam2 = 0;

		for (int i = 1; i < 220; i++) {

			if (sayi1 % i == 0) {

				toplam = toplam + i;
			}

		}

		for (int i = 1; i < 280; i++) {

			if (sayi2 % i == 0) {

				toplam2 = toplam2 + i;
			}

		}

		if (toplam == sayi2 && toplam2 == sayi1) {

			System.out.println("Girilen iki sayý kardeþ sayýdýr.");

		}else {System.out.println("Malesef kardeþ sayý deðiller.");}

	}

}
