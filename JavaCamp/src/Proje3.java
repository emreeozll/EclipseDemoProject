
public class Proje3 {

	public static void main(String[] args) {
		// M�kemmel Say� Bulma

		int number = 28;

		int total = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {

				total = total + i;

			}
		}

		boolean durum = number == total;

		if (durum) {
			System.out.println("Girilen say� m�kemmel say�d�r.");

		} else {
			System.out.println("Girilen say� m�kemmel say� de�ildir!!!");
		}

	}
}
