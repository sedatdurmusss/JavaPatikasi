import java.util.Scanner;


public class userInfo {
    public static void main(String[] args) {
        String userName , password , newPassword ;
        int select ;

        Scanner input = new Scanner(System.in);
        Scanner selection = new Scanner(System.in);

        System.out.print("Kullanici Adi :");
        userName = input.nextLine();
        System.out.print("Sifre :");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("java123")){
            System.out.println("Basarili Giris");
        }
        else if (!password.equals("12345")) {
            System.out.println("Yanlis Sifre");
            System.out.println("sifrenizi güncellemek ister misiniz?");
            System.out.println("1-Evet\t2-Hayir");
            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.print("Yeni Sifre :");
                    newPassword = selection.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.println("Sifre olusturulamadı, lütfen başka sifre giriniz :");
                    }
                    else {
                        System.out.println("Sifre olusturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Sifre degistirilmedi. Lutfen girisi tekrar deneyiniz");
                    break;
                default:
                    System.out.println("Yanlis secenek");
            }
        } else if (!userName.equals("Patika")) {
            System.out.println("Kullanici adi yanlis. Lütfen yeniden deneyiniz");
        }
        else {
            System.out.println("HATALI BİLGİ");
        }



    }
}
