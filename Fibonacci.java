import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayisini giriniz: ");
        int basamak = input.nextInt();
        int toplam,baslangic=0, ekleneceksayi =1;

        for (int i=2; i <= basamak; i++){

            toplam = baslangic + ekleneceksayi;
            System.out.println(baslangic+"+"+ekleneceksayi+" = "+toplam);

            //toplam = baslangic + ekleneceksayi;
            baslangic= ekleneceksayi;
            ekleneceksayi=toplam;
        }

    }
}
