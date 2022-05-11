import java.util.Scanner;

public class ustAlma {
    public static void main(String[] args) {

        int x,y;

        Scanner nesneAdi = new Scanner(System.in);

        System.out.print("ussu alinacak sayi:");
        x = nesneAdi.nextInt();

        System.out.print("us olacak sayi:");
        y = nesneAdi.nextInt();


        int total = 1;

        for (int i =1; i<=y ;i++){
            total *= x;

        }
        System.out.println("Cevap : "+total);

    }
}
