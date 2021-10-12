package Giris;
import java.util.Scanner;

public class Pratik5 {
    public static void main (String[]args){
        double pi = 3.14, alan, cevre, r;

        Scanner yarıcap = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        r = yarıcap.nextDouble();


        alan = pi * r * r;
        System.out.println("Alan : " + alan);

        cevre = 2 * pi * r;
        System.out.println("Çevre : "+ cevre);

        //ÖDEV
        double merkezAcı, daireDilimAlanı;
        Scanner a = new Scanner(System.in);
        System.out.println("Merkez Açıyı giriniz : ");
        merkezAcı = a.nextDouble();

        daireDilimAlanı=(pi * (r * r) * merkezAcı)/360;
        System.out.println("Daire Diliminini Alanı : " + daireDilimAlanı);


    }
}
