import java.sql.SQLOutput;
import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int sayi1,sayi2;

        Scanner input   = new Scanner(System.in);
        //Formül : C(n,r) = n! / (r! * (n-r)!)


        System.out.println("Birinci sayiyi giriniz:");
        sayi1 = input.nextInt();

        int n=1;

        for (int i=1; i<=sayi1; i++){
            n *= i;
        }

        System.out.println("Ikinci sayiyi giriniz:");
        sayi2 = input.nextInt();

        int r =1;
        for (int s=1; s<=sayi2; s++){
            r *= s;
        }
        int fark =1;
        for (int sayac = 1; sayac <= (sayi1-sayi2); sayac++) {
            fark *= sayac;
        }

        int kombinasyon = n / (r * fark);
        System.out.println("C("+sayi1+","+sayi2+"): "+ kombinasyon);
    }
}
