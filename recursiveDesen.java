import java.util.Scanner;

public class recursiveDesen {
    static int isPositive(int s){
        if (s <= 0){

            return s;
        }
        else {
            System.out.print(s+" ");

            return isPositive(s-5);
        }


    }
    static int isNegative(int s,int d){
        if (s > d) {
            return s;
        } else {
            System.out.print(s + " ");
            return isNegative(s + 5, d);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int number = input.nextInt();
        if (number >0 ){
            isNegative(isPositive(number),number);
            
        }
    }
}
