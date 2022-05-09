import java.util.Scanner;

public class dereceyeGoreEtkinlik {

    public static void main(String[] args) {
        int derece; 
        Scanner inp = new Scanner(System.in);
        System.out.println("Hava kaç derece? : ");
        derece = inp.nextInt();

        if (derece < 5) {
            System.out.println("Kayak yapmanin tam zamani!");
        } else if (derece >= 5 && derece <= 15) {
            System.out.println("Sinemaya yeni bir film mi gelmiş ne!?.");
        } else if (derece >= 15 && derece <= 25) {
            System.out.println("Piknik kokusu senin de geldi mi burnuna");
        } else if (derece > 25) {
            System.out.println("Karpuz kabugu deniz düsmüs haberin olsun.");
        }

    }

}
