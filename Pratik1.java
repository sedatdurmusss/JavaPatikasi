package Giris;
import java.util.Scanner;

public class Pratik1 {
    public static void main(String[] args) {
        // 1. Adım -> değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

         // 2. Adım -> scanner sınıfı oluştur. En başa import edilir! -> import java.util.scanner (kullanıcıdan veri almak için)
        // 3. Adım -> Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);
        // 4. adım -> değerleri alıyoruz
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih  notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik  notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        boolean kosul1 = sonuc >= 60;
        System.out.println("Durum : " + (kosul1 == true ? "Sınıfı Geçti" : "Sınıfta Kaldı"));


     }
}