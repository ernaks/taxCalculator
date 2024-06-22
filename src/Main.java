import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir tutar giriniz: ");
        double tutar = sc.nextDouble();
        double kdv = 0;
        if(tutar > 0 && tutar <= 1000)
            kdv = 0.18;
        else if(tutar > 1000)
            kdv = 0.08;
        double kdvTutar = tutar * kdv;
        double kdvliFiyat = tutar + kdvTutar;
        System.out.println("KDV'siz fiyat: " + tutar);
        System.out.println("KDV'li fiyat: " + kdvliFiyat );
        System.out.println("KDV Oranı: " + kdv * 100);
        System.out.println("KDV tutarı: " + kdvTutar);
    }
}