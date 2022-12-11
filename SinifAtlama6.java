package baslangic;

import java.util.Scanner;

public class SinifAtlama6 {

	public static void main(String[] args) {
		int turkce,matematik,fenBilgisi,bedenEgitimi;
		double ortalama=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = scan.nextInt();
		System.out.print("Matematik notunuzu giriniz: ");
		matematik = scan.nextInt();
		System.out.print("Beden Eğitimi notunuzu giriniz: ");
		bedenEgitimi = scan.nextInt();
		System.out.print("Fen Bilgisi notunuzu giriniz: ");
		fenBilgisi = scan.nextInt();
		
		ortalama= (turkce+ matematik+ fenBilgisi+ bedenEgitimi)/4;
		
		if(ortalama<=50) {
			System.out.println("\nSınıfta kaldınız!Seneye görüşmek üzere!!");
		}
		else {
			System.out.println("\nTebrikler!!Sınıfı başarılı bir şekilde geçtiniz.");
		}
        System.out.println("Ortalamanız: "+ortalama); 
	}

}
