import java.util.Scanner;

public class biletFiyat {
    public static void main(String[] args) {
        int yas, secenek;
        double tutar, mesafe, yasindirimi, gidisDonusindirim;



        Scanner input = new Scanner(System.in);
        Scanner selection = new Scanner(System.in);

        System.out.println("Yasinizi giriniz.");
        yas = input.nextInt();

        System.out.println("Mesafeyi giriniz.");
        mesafe = input.nextInt();

        System.out.println("1- tek yon \n2- Gidis-Donus ");
        System.out.println("Ucus Turunu seciniz.");
        secenek = selection.nextInt();

        tutar = mesafe * 0.10;

        switch (secenek){
            case 1:{
                if (yas<12){
                    yasindirimi = tutar * 0.50;
                    tutar = tutar - yasindirimi;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati " + tutar +" TL");
                }
                else if (yas >= 12 && yas < 25){
                    yasindirimi = tutar * 0.10;
                    tutar = tutar - yasindirimi;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati " + tutar +" TL");
                }
                else if (yas >=25 && yas <65){
                    tutar = tutar;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati " + tutar +" TL");

                }else if (yas >=65) {

                    yasindirimi = tutar * 0.30;
                    tutar = tutar - yasindirimi;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati " + tutar +" TL");
                }
                break;
            }
            case 2:{
                if (yas<12){
                    yasindirimi = tutar * 0.50;
                    gidisDonusindirim = (tutar * 0.20)*2;
                    tutar = tutar - yasindirimi -gidisDonusindirim;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati: " + tutar +" TL");
                }else if (yas >= 12 && yas < 25){
                    yasindirimi = tutar * 0.10;
                    gidisDonusindirim = (tutar * 0.20)*2;
                    tutar = tutar - yasindirimi -gidisDonusindirim;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati " + tutar +" TL");
                }else if (yas >=25 && yas <65){
                    tutar = tutar;
                    gidisDonusindirim = (tutar * 0.20)*2;
                    tutar = tutar - gidisDonusindirim;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati " + tutar +" TL");

                }else if (yas >=65) {

                    yasindirimi = tutar * 0.30;
                    gidisDonusindirim = (tutar * 0.20)*2;
                    tutar = tutar - yasindirimi -gidisDonusindirim;
                    System.out.println("Ucus Turunuz: "+secenek);
                    System.out.println("Bilet Fiyati " + tutar +" TL");
                }

                break;
            } default:
                System.out.println("Hatali Veri Girildi!!");

        }
    }
}
