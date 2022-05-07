import java.util.Scanner;
// scanner import edildi.
public class calcuCl {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        int number1,number2, select;
        ;
        // kullanıcan veri almak için scanner kullanıldı.
        Scanner input = new Scanner(System.in);

        //kullanıcıdan verileri al

        System.out.println("Birinci sayiyi giriniz.");
        number1 = input.nextInt();

        System.out.println("1- Toplama\n2- Cikartma\n3- Carpma\n4-Bolme ");
        System.out.println("Yapilacak islemi seciniz.");
        select = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz.");
        number2 = input.nextInt();


        switch (select){
            case 1:{
                System.out.println("Sonuc: "+(number1+number2));
                break;
            }
            case 2:{
                System.out.println("Sonuc: "+(number1-number2));
                break;
            }
            case 3:{
                System.out.println("Sonuc: "+(number1*number2));
                break;
            }
            case 4: {
                if (number2 != 0) {
                    System.out.println("Sonuc: " + (number1 / number2));
                }  else   {
                    System.out.println("Bir sayi 0 ile bolunemez");
                }
                break;
            }
            default:
                System.out.println("Hatali Veri Girildi!!");
            }
        }


    }
