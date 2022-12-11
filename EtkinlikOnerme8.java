package baslangic;

import java.util.Scanner;

public class EtkinlikOnerme8 {

	public static void main(String[] args) {
		// Hava sıcaklığın al.
		// Sıcaklık 30 veya daha yüksekse yüzmetkinliğini öner.
		// 5 ve 30 arasında ise sinemaöner.
		// 4 ve daha az ise kayak yapmayı öner.
		
		Scanner scan = new Scanner(System.in);
		int sicaklik;
		System.out.print("Hava sıcaklığını giriniz: ");
		sicaklik = scan.nextInt();
		
		if(sicaklik>30) {
			System.out.println("Bu havada yüzmeye gidilir !");
		}
		else if(sicaklik<=30 && sicaklik>=5) {
			System.out.println("Bu havada en iyi sinemaya gidilir !");
		}
		else {
			System.out.println("Bu havada en iyi kayağa gidilir !");
		}
	}

}
