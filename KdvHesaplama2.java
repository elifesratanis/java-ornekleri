package baslangic;

import java.util.Scanner;

public class KdvHesaplama2 {

	public static void main(String[] args) {
		double tutar,kdvliFiyat, kdv=0.18;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Ürünün tutarını giriniz:");
		tutar= input.nextDouble();
		
		kdvliFiyat= tutar+ (tutar*kdv);
		
		System.out.println("Ürünün kdv eklenmiş fiyatı : "+ kdvliFiyat);
		

	}

}
