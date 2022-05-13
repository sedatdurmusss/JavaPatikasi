import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        number = input.nextInt();

        int tempNumber = number;
        //girilen sayının basamak sayısını bulmak için (int olduklarından) 10 a bölündüğünde sayının son basamağı azalır
        // ve sayı küçülerek sıfıra kadar kaç adımla giderse o kadar basamak vardır

        int basamakSayi = 0;
        int basamakDegeri;
        int basamakUs;
        int result = 0;

 /*
        while (number != 0){
            number /= 10;
            basamakSayi++;
        }
*/
        while (tempNumber != 0){
            tempNumber /= 10;
            basamakSayi++;
        }
        // Bir sayının son basamağını bulma
        //mod 10 dan kalan son basamak olur.

        // buradada kullanıcıdan gelen number değişkenini kullanıcaz fakar yukarıdaki while döngsünde biz onu sıfıra
        // kadar indirdi. Bu yüzden numberi geçici bir değere atayıp onu kullanmak mantıklı
        // int tempNumber = number; -> bunu her iki yerde de kullıcağın için en üste taşımak mantıklı
        tempNumber = number;
        int counter = 1;
        while (tempNumber != 0){
            basamakDegeri = tempNumber % 10;
            System.out.println(counter+". basamakDegeri: "+basamakDegeri);
            basamakUs = 1;
            for (int i = 1; i <= basamakSayi; i++){
                basamakUs *= basamakDegeri;
            }
            counter++;
            tempNumber /= 10;
            result += basamakUs;

        }
        System.out.println("result: "+result);

        if (result == number){
            System.out.println(number+" Sayisi armstrong sayidir");
        }else{
            System.out.println(number+" Sayisi armstrong sayi Degildir");
        }




    }
}
