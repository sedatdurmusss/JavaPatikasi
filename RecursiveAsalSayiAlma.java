import java.util.Scanner;

public class RecursiveAsalSayiAlma {

    static  boolean asal(int number, int i){
        if (number <= 2){
            return (number == 2) ? true : false;
        }

        if (number % i == 0){
            return false;
        }

        if (i * i > number){
            return true;
        }
        return asal(number, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayıyı giriniz: ");
        int number = sc.nextInt();

        if(asal(number,2)){
            System.out.println( number +" sayısı asaldır. ");
        }else{
            System.out.println(number + " sayısı asal değildir.");
        }
    }
}
