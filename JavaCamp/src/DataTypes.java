
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primitif Tipler - Ýlket Tipler
		// Genel olarak sayýsal veri tutmak amacýyla kullanýlýrlar.

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

		// Reel sayý tipleri - ondalýklý sayýlarý tutmak amacýyla kullanýlýrlar.
		float ondalýk = 34.23f * 2; // 32 bit
		System.out.println(ondalýk);

		double ondalýk2 = 565.454 / 23;
		System.out.println(ondalýk2);

		System.out.println("----------------------------------");

		// char --> Karakterleri tutmak için char veri tipi kullanýlýr.

		char karakter1 = 'J';
		char karakter2 = 'A';
		char karakter3 = 'V';
		char karakter4 = 'A';
		System.out.print(karakter1);
		System.out.print(karakter2);
		System.out.print(karakter3);
		System.out.println(karakter4);

		System.out.println("----------------------------------");

		// boolean --> Yalnýzca 2 deðer alýr (true veya false)
		int a = 5;
		int b = 23;

		boolean durum = a < b;
		System.out.println(durum);

		System.out.println("----------------------------------");

		// String - Referans tiptir fakat istisnai bir durum olarak deðer tip olarak
		// çalýþýr.
		String metin = "Emre Özel";
		System.out.println(metin + " - Öðrenci");

	}

}
