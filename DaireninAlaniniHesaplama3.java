package baslangic;

import java.util.Scanner;

public class DaireninAlaniniHesaplama3 {

	public static void main(String[] args) {
		double daireninAlani,r,pi=3.14;
		Scanner input = new Scanner(System.in);
	
		System.out.println("Bir yarıçap değeri giriniz: ");
		r= input.nextDouble();
		
		daireninAlani = pi*r*r;
		System.out.println("Dairenin alanı: "+ daireninAlani);

	}

}
