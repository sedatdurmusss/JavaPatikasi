import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0, deger = 0, min = 1, max = 1;

        System.out.println("Kaç tane sayı gireceksiniz?");
        int N = input.nextInt();

        for (int i=1;i<=N;i++){
            System.out.print(i+". sayıyı giriniz: ");
            deger = input.nextInt();
            toplam = toplam + deger;
            if (i == 1){
                max = deger;
                min = deger;
            }

            if (deger > max){
                max = deger;
            }

            if (deger < min){
                min = deger;
            }

        }
        System.out.println("\nSayıların Toplami: "+toplam);
        System.out.println("Maksimum Sayi: "+max);
        System.out.println("Minimum Sayi: "+min);
    }
}
