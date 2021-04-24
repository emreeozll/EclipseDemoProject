
public class Arrays {

	public static void main(String[] args) {
		// Arrays - Diziler

		String ogrencý1 = "Engin";
		String ogrencý2 = "Emre";
		String ogrencý3 = "Ahmet";
		String ogrencý4 = "Samet";

		System.out.println(ogrencý1);
		System.out.println(ogrencý2);
		System.out.println(ogrencý3);
		System.out.println(ogrencý4);

		System.out.println("----------------------");

		String ogrencýler[] = new String[4];

		ogrencýler[0] = "Engin";
		ogrencýler[1] = "Emre";
		ogrencýler[2] = "Samet";
		ogrencýler[3] = "Salih";
		for (int dongu = 0; dongu < ogrencýler.length; dongu++) {

			System.out.println(ogrencýler[dongu]);
		}

	}

}
