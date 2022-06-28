import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayisini giriniz: ");
        int n = input.nextInt();

        for (int i =1; i<=n; i++){
            for (int k =1; k<=(n-i);k++){
                System.out.print(" ");
            }
            //yıldız yazdırma
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            //bir aşağıya geçmesi için boş kullandık
            System.out.println();
        }
        for (int s =n-1; s>=1; s--){
            for (int d=(n-s); d>=1; d--){
                System.out.print(" ");
            }
            for (int t=(2*s)-1; t>=1; t--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
