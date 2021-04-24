
public class Arrays {

	public static void main(String[] args) {
		// Arrays - Diziler

		String ogrenci1 = "Engin";
		String ogrenci2 = "Emre";
		String ogrenci3 = "Ahmet";
		String ogrenci4 = "Samet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("----------------------");

		String ogrenciler[] = new String[4];

		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Emre";
		ogrenciler[2] = "Samet";
		ogrenciler[3] = "Salih";
		for (int dongu = 0; dongu < ogrenciler.length; dongu++) {

			System.out.println(ogrenciler[dongu]);
		}

	}

}
