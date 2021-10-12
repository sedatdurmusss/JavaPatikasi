package Giris;
import java.util.Scanner;

public class Pratik4 {
    public static void main (String[]args) {

        int km;
        double kmBası = 2.20, toplamUcret, acılısUcret = 10, minUcret = 20;

        Scanner mesafe = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz : ");
        km = mesafe.nextInt();

        toplamUcret = acılısUcret + (km * kmBası);
        toplamUcret = (toplamUcret < minUcret) ? minUcret : toplamUcret;

        System.out.println("Toplam Ücret : " + toplamUcret);



    }
}
