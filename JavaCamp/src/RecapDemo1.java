
import java.util.Scanner;

public class RecapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Birinci say�y� giriniz = ");
		int sayi1 = scan.nextInt();

		System.out.println("�kinci say�y� giriniz = ");
		int sayi2 = scan.nextInt();

		System.out.println("���nc� say�y� giriniz = ");
		int sayi3 = scan.nextInt();

		System.out.println("Say�lar s�ralan�yor...");

		int enb�y�k = 0;

		if (sayi1 < sayi2) {
			enb�y�k = sayi2;
		} else {
			enb�y�k = sayi1;
		}

		if (enb�y�k < sayi3) {
			enb�y�k = sayi3;
		}

		System.out.println("En b�y�k say�m�z = " + enb�y�k);

		System.out.println("-------------------------------");

		int arabahiz = 90;

		if (arabahiz > 100) {
			System.out.println("H�z limitini a�t�n�z.");
		} else if (arabahiz < 100 && arabahiz >= 90) {
			System.out.println("Radara girdiniz.");
		} else {
			System.out.println("H�z limitiniz normal");
		}

	}

}
