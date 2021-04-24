
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primitif Tipler - �lket Tipler
		// Genel olarak say�sal veri tutmak amac�yla kullan�l�rlar.

		// byte --> -128--127
		byte littleNumber = 65;
		System.out.println(littleNumber);

		// short --> -32768--32767
		short number1 = 30756;
		System.out.println(number1);

		// int --> -2^31--2^31-1
		int number2 = 2323423;
		System.out.println(number2);

		// long --> -2^63--2^63-1
		long number3 = 664545645;
		long number4 = number3 * number3;
		System.out.println(number4);

		System.out.println("----------------------------------");

		// Reel say� tipleri - ondal�kl� say�lar� tutmak amac�yla kullan�l�rlar.
		float ondal�k = 34.23f * 2; // 32 bit
		System.out.println(ondal�k);

		double ondal�k2 = 565.454 / 23;
		System.out.println(ondal�k2);

		System.out.println("----------------------------------");

		// char --> Karakterleri tutmak i�in char veri tipi kullan�l�r.

		char karakter1 = 'J';
		char karakter2 = 'A';
		char karakter3 = 'V';
		char karakter4 = 'A';
		System.out.print(karakter1);
		System.out.print(karakter2);
		System.out.print(karakter3);
		System.out.println(karakter4);

		System.out.println("----------------------------------");

		// boolean --> Yaln�zca 2 de�er al�r (true veya false)
		int a = 5;
		int b = 23;

		boolean durum = a < b;
		System.out.println(durum);

		System.out.println("----------------------------------");

		// String - Referans tiptir fakat istisnai bir durum olarak de�er tip olarak
		// �al���r.
		String metin = "Emre �zel";
		System.out.println(metin + " - ��renci");

	}

}
