import java.util.Scanner;

public class burcumNe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Ay;
        int gun;

        System.out.println("Hangi Ayda dogdunuz? :");
        Ay = input.nextLine();

        System.out.println("Hangi Gun dogdunuz? :");
        gun = input.nextInt();

        if (Ay.equals("Ocak") || Ay.equals("ocak")){
           if (gun >=1 && gun <=31){

               if (gun<=21){
                   System.out.println("Burcunuz Oglak! ");
               }else{
                   System.out.println("Burcunuz Kova! ");
               }
           }else{
               System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
           }

        }
        else if (Ay.equals("Subat") || Ay.equals("subat")){
            if (gun >=1 && gun <=28){

                if (gun<=19){
                    System.out.println("Burcunuz Kova! ");
                }else{
                    System.out.println("Burcunuz Balik! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Mart") || Ay.equals("mart")){
            if (gun >=1 && gun <=31){

                if (gun<=20){
                    System.out.println("Burcunuz Balik! ");
                }else{
                    System.out.println("Burcunuz Koc! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Nisan") || Ay.equals("nisan")){
            if (gun >=1 && gun <=30){

                if (gun<=20){
                    System.out.println("Burcunuz Koc! ");
                }else{
                    System.out.println("Burcunuz Boga! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Mayis") || Ay.equals("mayis")){
            if (gun >=1 && gun <=31){

                if (gun<=21){
                    System.out.println("Burcunuz Boga! ");
                }else{
                    System.out.println("Burcunuz Ikizler! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Haziran") || Ay.equals("haziran")){
            if (gun >=1 && gun <=30){

                if (gun<=22){
                    System.out.println("Burcunuz Ikizler! ");
                }else{
                    System.out.println("Burcunuz Yengec! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Temmuz") || Ay.equals("temmuz")){
            if (gun >=1 && gun <=31){

                if (gun<=22){
                    System.out.println("Burcunuz Yengec! ");
                }else{
                    System.out.println("Burcunuz Aslan! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Agustos") || Ay.equals("agustos")){
            if (gun >=1 && gun <=31){

                if (gun<=22){
                    System.out.println("Burcunuz Aslan! ");
                }else{
                    System.out.println("Burcunuz Basak! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Eylul") || Ay.equals("eylul")){
            if (gun >=1 && gun <=30){

                if (gun<=22){
                    System.out.println("Burcunuz Basak! ");
                }else{
                    System.out.println("Burcunuz Terazi! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Ekim") || Ay.equals("ekim")){
            if (gun >=1 && gun <=31){

                if (gun<=22){
                    System.out.println("Burcunuz Terazi! ");
                }else{
                    System.out.println("Burcunuz Akrep! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Kasim") || Ay.equals("kasim")){
            if (gun >=1 && gun <=30){

                if (gun<=21){
                    System.out.println("Burcunuz Akrep! ");
                }else{
                    System.out.println("Burcunuz Yay! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else if (Ay.equals("Aralik") || Ay.equals("aralik")){
            if (gun >=1 && gun <=31){

                if (gun<=21){
                    System.out.println("Burcunuz Yay! ");
                }else{
                    System.out.println("Burcunuz Oglak! ");
                }
            }else{
                System.out.println("Yanlis gun bilgisi girdiniz. Lutfen tekrar giriniz.");
            }
        }
        else {
            System.out.println("Yanlis Ay bilgisi girdiniz. Lutfen tekrar giriniz.");
        }



    }
}
