
public class Arrays {

	public static void main(String[] args) {
		// Arrays - Diziler

		String ogrenc�1 = "Engin";
		String ogrenc�2 = "Emre";
		String ogrenc�3 = "Ahmet";
		String ogrenc�4 = "Samet";

		System.out.println(ogrenc�1);
		System.out.println(ogrenc�2);
		System.out.println(ogrenc�3);
		System.out.println(ogrenc�4);

		System.out.println("----------------------");

		String ogrenc�ler[] = new String[4];

		ogrenc�ler[0] = "Engin";
		ogrenc�ler[1] = "Emre";
		ogrenc�ler[2] = "Samet";
		ogrenc�ler[3] = "Salih";
		for (int dongu = 0; dongu < ogrenc�ler.length; dongu++) {

			System.out.println(ogrenc�ler[dongu]);
		}

	}

}
