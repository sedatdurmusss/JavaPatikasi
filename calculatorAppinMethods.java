import java.util.Scanner;

public class Main {
    public static void sum() {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int sonuc = 0;

        do {
            System.out.print("Sayi Giriniz(0:Sonuc: ");
            sayi = scan.nextInt();
            sonuc = sonuc + sayi;
        } while (sayi != 0);

        System.out.println("Girdiğiniz Sayıların Toplamı: " + sonuc);
    }

    public static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scan.nextInt();
        int sayi;
        int sonuc = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print("Sayı Giriniz: ");
            sayi = scan.nextInt();

            if (i == 1) {
                sonuc = sonuc + sayi;
            } else {
                sonuc = sonuc - sayi;
            }
        }

        System.out.println("Sonuc: " + sonuc);
    }

    public static void multi() {
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 1;

        while (true) {
            System.out.print("Sayı Giriniz: ");
            sayi = scan.nextInt();

            if (sayi == 1)
                break;

            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    public static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scan.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    public static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int taban = scan.nextInt();

        System.out.print("Üs Değerini Giriniz: ");
        int us = scan.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc = sonuc * taban;
        }
        System.out.println(taban + " üssü " + us + " = " + sonuc);
    }

    public static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyelini almak Istediğiniz Sayıyı Giriniz: ");
        int sayi = scan.nextInt();
        int sonuc = 1;

        for (int i = sayi; i > 0; i--) {
            sonuc = sonuc * i;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    public static void modAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu Alınacak Sayıyı Giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Modu Giriniz: ");
        int mod = scan.nextInt();

        System.out.println("Sonuc: " + (sayi1 % mod));
    }

    public static void dikdortgen() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kisa Kenari Giriniz: ");
        int kisaKenar = scan.nextInt();
        System.out.print("Uzun Kenari Giriniz: ");
        int uzunKenar = scan.nextInt();

        System.out.println("Dikdörtgenin Çevresi: " + 2 * (uzunKenar + kisaKenar));
        System.out.println("Dikdörtgenin Alanı: " + (uzunKenar * kisaKenar));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İslemi\n"
                + "2- Cıkarma İslemi\n"
                + "3- Carpma İslemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabi\n"
                + "0- Cikis Yap";

        System.out.println(menu);
        while (true){
            System.out.print("Seciminizi Yapin: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAl();
                    break;
                case 8:
                    dikdortgen();
                    break;

                default:
                    System.out.println("Hatali Giris Yaptınız...");
            }

        }

    }
}
