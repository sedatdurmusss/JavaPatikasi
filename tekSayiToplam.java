import  java.util.Scanner;

public class tekSayiToplam {
    public static void main(String[] args) {
        int x, total = 0;

        Scanner degisken = new Scanner(System.in);

        do {
            System.out.println("sayi giriniz:");
            x = degisken.nextInt();

            if ((x % 2 == 0) && (x % 4 == 0) ){
                total += x;

            }
        }while (x % 2 == 0);
        System.out.println("toplam: "+total);

    }
}
