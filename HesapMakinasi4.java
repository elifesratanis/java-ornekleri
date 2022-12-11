package baslangic;

import java.util.Scanner;

public class HesapMakinasi4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.print("İlk sayıyı giriniz: ");
		sayi1= scan.nextInt();
		System.out.print("\nİkinci sayıyı giriniz: ");
		sayi2= scan.nextInt();
		System.out.println("Aşağıdaki işlemlerden yapmak istediğiniz işlemi seçiniz.");
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz: ");
		secim= scan.nextInt();
		
		
		if(secim==1){	
			System.out.println("Toplama: "+(sayi1+sayi2));
		}
		else if(secim==2) {
			System.out.println("Çıkarma: "+(sayi1-sayi2));
		}
		else if(secim==3) {
			System.out.println("Çarpma: "+(sayi1*sayi2));
		}
		else if(secim==4) {
			if(sayi2==0) {
				System.out.println("Sonuç belirsizdir.İkinci sayıyı 0'dan farklı giriniz.");
			}
			else {
				System.out.println("Bölme: "+(sayi1/sayi2));
			}
		}
		else {
			System.out.println("Geçersiz sayı girdiniz!");
		}

		

	}

}
