package Giris;
import java.util.Scanner;

public class Pratik7 {
    public static void main (String[]args){
        double toplamTutar, ArmutFiyat = 2.14, ElmaFiyat = 3.67, DomatesFiyat = 1.11, MuzFiyat = 0.95, PatlicanFiyat = 5.00;
        int Armut, Elma, Domates, Muz, Patlican;

        Scanner Kg = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? : ");
        Armut = Kg.nextInt();

        System.out.println("Elma Kaç Kilo ? : ");
        Elma = Kg.nextInt();

        System.out.println("Domates Kaç Kilo ? : ");
        Domates = Kg.nextInt();

        System.out.println("Muz Kaç Kilo ? : ");
        Muz = Kg.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        Patlican = Kg.nextInt();

        toplamTutar = (ArmutFiyat*Armut)+(ElmaFiyat*Elma)+(DomatesFiyat*Domates)+(MuzFiyat*Muz)+(PatlicanFiyat*Patlican);
        System.out.println( "Toplam Tutar : " + toplamTutar);





    }
}
