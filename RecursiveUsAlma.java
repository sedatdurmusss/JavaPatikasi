import java.util.Scanner;

public class RecursiveUsAlma.java {

    static  int power(int taban, int us){
        if(us==0) return 1;
        return taban * power(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int taban = sc.nextInt();
        System.out.print("Ussu giriniz: ");
        int us = sc.nextInt();
        System.out.println("Sonuc = " + power(taban,us));
    }

}
