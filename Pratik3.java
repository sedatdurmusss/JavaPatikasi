package Giris;

import java.util.Scanner;

public class Pratik3 {
    public static void main (String[]args) {

        // 1. Adım -> değişkenleri oluştur
        int a, b;
        double c, u, cevre, alan;

        // 2. Adım -> scanner sınıfı oluştur. En başa import edilir! -> import java.util.scanner (kullanıcıdan veri almak için)
        // 3. Adım -> Scanner sınıfını tanımladık

        Scanner kenarlar = new Scanner(System.in);
        System.out.println("a değerini giriniz: ");
        a = kenarlar.nextInt();

        System.out.println("b değerini giriniz: ");
        b = kenarlar.nextInt();

        /*hipotenusü bulmak için bu
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus değeri: " + c);
        */
        System.out.println("c değerini giriniz: ");
        c = kenarlar.nextInt();

        u = (a+b+c)/2;
        cevre = 2*u;
        System.out.println("cevre : " + cevre);
        alan = Math.sqrt (u*(u-a)*(u-b)*(u-c)); // alan = (a*b)/2; şeklinde de hesaplanabilir.
        System.out.println("alan : " + alan);







    }
}
