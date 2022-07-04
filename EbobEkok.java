import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen birinci değeri giriniz : ");
        int number1 = scanner.nextInt();

        System.out.print("lütfen ikinci değeri giriniz : ");
        int number2 = scanner.nextInt();
        int ebob = 1;

        //ebob

        if (number1 >= number2) {
            int k = number2;

            while (ebob == 1) {
                if (number1 % k == 0 && number2 % k == 0) {
                    ebob = k;
                }
                k--;
            }
            System.out.println("ebob : "+ebob);
        } else if (number2 >= number1) {
            int k = number1;
            while (ebob == 1) {
                if (number1 % k == 0 && number2 % k == 0) {
                    ebob = k;
                }
                k--;

            }
            System.out.println("ebob : "+ebob);
        }
        //ekok

        int max = number1 * number2;
        int ekok = max;
        int i =max;
        while (ekok == max ){
            if (i%number1 == 0 && i%number2 == 0){
                ekok = i/ebob;
            }

            i--;

        }
        System.out.println("ekok : " +ekok);


    }
}
