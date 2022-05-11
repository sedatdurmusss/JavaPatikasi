import java.util.Scanner;


public class dortveBesinKati {
    public static void main(String[] args) {

        int x;

        Scanner degisken = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        x = degisken.nextInt();

        System.out.println("4'un kuvvetleri:");
        for (int i = 1; i <= x; i *= 4){
            System.out.print(i+",");
        }
        System.out.println(" ");
        System.out.println("5'in kuvvetleri:");
        for (int s = 1; s <= x; s *= 5){
            System.out.print(s+",");
        }

    }
}
