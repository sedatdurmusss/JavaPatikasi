import java.util.Scanner;
public class tersUcgen {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayisini giriniz: ");
        int n = input.nextInt();

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
