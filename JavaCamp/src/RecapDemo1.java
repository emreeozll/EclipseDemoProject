
import java.util.Scanner;

public class RecapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Birinci sayýyý giriniz = ");
		int sayi1 = scan.nextInt();

		System.out.println("Ýkinci sayýyý giriniz = ");
		int sayi2 = scan.nextInt();

		System.out.println("Üçüncü sayýyý giriniz = ");
		int sayi3 = scan.nextInt();

		System.out.println("Sayýlar sýralanýyor...");

		int enbüyük = 0;

		if (sayi1 < sayi2) {
			enbüyük = sayi2;
		} else {
			enbüyük = sayi1;
		}

		if (enbüyük < sayi3) {
			enbüyük = sayi3;
		}

		System.out.println("En büyük sayýmýz = " + enbüyük);

		System.out.println("-------------------------------");

		int arabahiz = 90;

		if (arabahiz > 100) {
			System.out.println("Hýz limitini aþtýnýz.");
		} else if (arabahiz < 100 && arabahiz >= 90) {
			System.out.println("Radara girdiniz.");
		} else {
			System.out.println("Hýz limitiniz normal");
		}

	}

}
