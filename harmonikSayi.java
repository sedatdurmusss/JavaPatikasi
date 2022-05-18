import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayiini giriniz : ");
        n = input.nextInt();

        double result = 0.0;

        for (int i =1; i<=n;i++){
            result += 1.0/i;
          // 1/i yapsaydık int dönüyordu bu yüzden double kullandık. 2.yol olarak int i=1 yerinde o da double a çevrilebilirdi
        }
        System.out.println("Sonuc : "+result);
    }
}
