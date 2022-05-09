import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.println("Yil giriniz: ");
        yil = input.nextInt();

        if (yil%4==0) {
            if ((yil % 100 == 0) && (yil % 400 == 0)) {
                System.out.println(yil + " artik bir yildir !");
            }
            System.out.println(yil + " artik bir yildir !");
        }else
            System.out.println(yil + " artik bir yil degildir !");
    }
}
