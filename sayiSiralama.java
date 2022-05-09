import java.util.Scanner;
// scanner import edildi.
public class sayiSiralama {
    public static void main(String[] args) {
      int num1,num2,num3;
      
      Scanner input = new Scanner(System.in);

        //kullanıcıdan verileri al

        System.out.println("Birinci sayiyi giriniz.");
        num1 = input.nextInt();
      
        System.out.println("Ikinci sayiyi giriniz.");
        num2 = input.nextInt();
      
        System.out.println("Ucuncu sayiyi giriniz.");
        num3 = input.nextInt();
      
      if (num1>num2 && num1> num3){
          if(num2>num3){
            System.out.println("Sayıların siralaması: num1 > num2 > num3 :"+num1+">"+num2+">"+num3);
          }else{
              System.out.println("Sayıların siralaması: num1 > num3 > num2 :"+num1+">"+num3+">"+num2+");
                }
      }else if (num2>num1 && num2> num3){
          if(num1>num3){
            System.out.println("Sayıların siralaması: num2 > num1 > num3 :"+num2+">"+num1+">"+num3);
          }else{System.out.println("Sayıların siralaması: num2 > num3 > num1 :"+num2+">"+num3+">"+num1+");
                }
      }else if (num3>num1 && num3> num2){
          if(num1>num2){
            System.out.println("Sayıların siralaması: num3 > num1 > num2 :"+num3+">"+num1+">"+num2);
          }else{System.out.println("Sayıların siralaması: num3 > num2 > num1 :"+num3+">"+num2+">"+num1+");
                }
      }
      
    }
