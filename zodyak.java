import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {
        int dogumTarihi;

        Scanner input = new Scanner(System.in);

        System.out.println("Dogum tarihinizi yil olarak giriniz: ");
        dogumTarihi = input.nextInt();

        dogumTarihi = dogumTarihi % 12;
        switch (dogumTarihi){
            case 0:
                System.out.println("Zodyak burcunuz Maymun");
                break;
            case 1:
                System.out.println("Zodyak burcunuz Horoz");
                break;
            case 2:
                System.out.println("Zodyak burcunuz Köpek");
                break;
            case 3:
                System.out.println("Zodyak burcunuz Domuz");
                break;
            case 4:
                System.out.println("Zodyak burcunuz Fare");
                break;
            case 5:
                System.out.println("Zodyak burcunuz Öküz");
                break;
            case 6:
                System.out.println("Zodyak burcunuz Kaplan");
                break;
            case 7:
                System.out.println("Zodyak burcunuz Tavşan");
                break;
            case 8:
                System.out.println("Zodyak burcunuz Ejderha");
                break;
            case 9:
                System.out.println("Zodyak burcunuz Yilan");
                break;
            case 10:
                System.out.println("Zodyak burcunuz At");
                break;
            case 11:
                System.out.println("Zodyak burcunuz Koyun");
                break;
            default:
                System.out.println("Hatali giris yaptiniz!!");
        }


    }
}
