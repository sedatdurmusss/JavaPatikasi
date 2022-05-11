import java.util.Scanner;

public class tamBolumveOrtalama {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Sayi giriniz");
        x = input.nextInt();

        for (int i =0; i<=x; i++){
            if ((i % 3 == 0) && ( i % 4 == 0)){
                System.out.println(i);
            }
        }

    }
}
