
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

		String ogrencýler[] = new String[4];

		ogrencýler[0] = "Engin";
		ogrencýler[1] = "Emre";
		ogrencýler[2] = "Samet";
		ogrencýler[3] = "Salih";
		for (int dongu = 0; dongu < ogrenciler.length; dongu++) {

			System.out.println(ogrenciler[dongu]);
		}

	}

}
