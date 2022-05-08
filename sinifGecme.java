import  java.util.Scanner;

public class sinifGecme {

    public static void main(String[] args) {
        int mat, fizik, kimya, muzik, turkce, toplam = 0;
        double counter = 0;
        Scanner input = new Scanner(System.in);


        System.out.print("Maths Enter Score :");
        mat = input.nextInt();
        if (!(mat <= 0 || mat >= 100)) {
            toplam += mat;
            counter++;
        }
        System.out.print("fizik notunuzu giriniz :");
        fizik = input.nextInt();
        if (!(fizik<= 0 || fizik >= 100)) {
            toplam += fizik;
            counter++;
        }
        System.out.print("Music Enter Score :");
        muzik = input.nextInt();
        if (!(muzik <= 0 || muzik >= 100)) {
            toplam += muzik;
            counter++;
        }
        System.out.print("Chemical Enter Score :");
        kimya = input.nextInt();
        if (!(kimya <= 0 || kimya >= 100)) {
            toplam += kimya;
            counter++;
        }
        System.out.print("Turkish Enter Score :");
        turkce = input.nextInt();
        if (!(turkce <= 0 || turkce >= 100)) {
            toplam += turkce;
            counter++;
        }

        if (toplam/counter<55){
            System.out.println("Sinifta kaldiniz ! ");
        }else{
            System.out.println("Sinifi gectiniz !");
        }



    }
}
