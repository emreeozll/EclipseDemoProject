import java.util.Scanner;

public class RecapDemo2 {

	public static void main(String[] args) {

		

		System.out.println("----------------------------------------");

		for (int i = 0; i < 3; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("�sminiz giriniz =");
			String isim = scan.next();

			switch (isim) {

			case "Emre":
			case "emre":
				System.out.println("�sminiz Emre'dir.");
				break;
			case "Hiko":
			case "hiko":
				System.out.println("Siz diyarbak�rl�s�n�z");
				break;
			default:
				System.out.println("AK�AM BBL VS LUQU�D MA� VAR, KA�IRMA");

			}

		}

	}

}
