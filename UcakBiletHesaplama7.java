package baslangic;

import java.util.Scanner;

public class UcakBiletHesaplama7 {

	public static void main(String[] args) {
		// Km birim fiyatı : 0.10 Dolar.
		// 12 yaşından küçükse toplam fiyata %50 indirim.
		// 12 ve 24 yaş arasındaysa %10 indirim.
		// 65 yaşından büyükse %30 indirim.
		// Gidiş dönüş alınırsa %20 indirim.
		// Bu koşullara göre uçak bileti hesaplayan program.
		
		
		Scanner scan = new Scanner(System.in);
		int km,yas,tip;
		System.out.print("Mesafeyi giriniz: ");
		km = scan.nextInt();
		System.out.print("\nYaşınızı giriniz: ");
		yas = scan.nextInt();
		System.out.print("\nYolculuk tipini seçiniz(1= Tek Gidiş , 2= Gidiş Dönüş): ");
		tip = scan.nextInt();
		
		
		double normalFiyat,yasIndirimi,tipIndirimi;
		
		if(km > 0 && yas>0 && (tip==1 || tip==2)) {
			normalFiyat = km * 0.10;
			if(yas < 12) {
				yasIndirimi = normalFiyat * 0.5; //İndirim oranını hesaplıyoruz.
			}
			else if(yas >= 12 && yas <= 24) {
				yasIndirimi = normalFiyat * 0.1;
			}
			else if(yas >= 65) {
				yasIndirimi = normalFiyat *0.3;
			}
			else {
				yasIndirimi =0;
			}
			normalFiyat -= yasIndirimi;// Normal fiyattan indirim fiyatını çıkarıyoruz.
			
			if(tip==2) {
				tipIndirimi = normalFiyat * 0.2;
				normalFiyat = (normalFiyat - tipIndirimi) * 2;
			}
			System.out.print("\nBilet tutarınız: " + normalFiyat + " DOLAR");
		}
		else {
			System.out.print("\nGirdiğiniz değer eksik veya yanlış lütfen tekrar deneyiniz !");
		}
		

	}

}
