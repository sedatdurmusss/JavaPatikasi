import java.util.Scanner;

public class tamBolumveOrtalama {
    public static void main(String[] args) {
        int x, toplam = 0, sayac=0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Sayi giriniz");
        x = input.nextInt();

        for (int i =0; i<=x; i++){
            if ((i % 3 == 0) && ( i % 4 == 0)){
                System.out.println(i);
                toplam = toplam + i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Toplam :" + toplam);
        System.out.println("sayac :" + sayac);
        System.out.println("3 ve 4'e Tam Bolunen Sayilarin Ortalamasi: " + ortalama);
    }
}
