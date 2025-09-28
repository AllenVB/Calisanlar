import java.util.Scanner;

public class Not {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adınızı giriniz : ");
		String isimString = scanner.nextLine();
		
		System.out.println("Soyadınızı giriniz : ");
		String soyisim = scanner.nextLine();
		
		System.out.println("Ders ismini giriniz :");
		String dersIsmi =scanner.nextLine();
		
		System.out.println("Vize notunuzu giriniz :");
		double vize = scanner.nextDouble();
		
		System.out.println("Ödev notunuzu giriniz :");
		double ödev = scanner.nextDouble();
		
		System.out.println("Final notunuzu giriniz :");
		double finalNot = scanner.nextDouble();
		
		double sonuc = (vize*0.3) + (ödev*0.1) + (finalNot*0.6);
		
		if (sonuc>=60) {
			System.out.println("Öğrenci dersten geçmiştir." + " " + "Notu :" +sonuc);
		}
		else {
			System.out.println("Öğrenci dersten kalmıştır." + " " +"Notu :"+sonuc);
		}
		
		
		
	}
}
