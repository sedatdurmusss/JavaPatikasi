package Giris;
import java.util.Scanner;

public class Pratik6 {
    public static void main (String[]args){

        double boy, kilo, vucutKitleEndeksi;
        Scanner metre = new Scanner(System.in);
        System.out.println("Boyunuzu (metre) giriniz : ");
        boy = metre.nextDouble();

        Scanner kg = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz : ");
        kilo = kg.nextDouble();

        vucutKitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz : " + vucutKitleEndeksi);


    }
}
