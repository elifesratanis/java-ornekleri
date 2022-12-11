package baslangic;

import java.util.Scanner;

public class Login5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k_adi,sifre;
		System.out.print("Kullanıcı adınınızı giriniz: ");
		k_adi= scan.nextLine();
		System.out.print("Şifrenizi giriniz: ");
		sifre= scan.nextLine();
		
		if(k_adi.equals("elif") && sifre.equals("1606")) {
			System.out.println("Başarılı bir şekilde giriş yaptınız.");
		}
		else {
			System.out.println("Kullanıcı adınız veya şifreniz hatalı!");
		}
		

	}

}
