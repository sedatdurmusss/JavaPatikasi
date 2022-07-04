import java.util.Scanner;
 
public class MukemmelSayi {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int number = scan.nextInt();
        
        for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
                toplam += i;
            }
        }
        if(number == toplam) {
            System.out.println(number + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(number + " Mükemmel bir sayi degildir.");
        }
    }
}
