package day09_NestedIfElseStatement_Ternary;

import java.util.Scanner;

public class C08_SwitchStatement {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan ay numarasini alip 'ismini' yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen ay numarasini girin");

        int ayNO= scanner.nextInt();

        if (ayNO==1) System.out.println("ocak");
        else if (ayNO==2) System.out.println("subat");
        else if (ayNO==3) System.out.println("mart");
        else if (ayNO==4) System.out.println("nisan");
        else if (ayNO==5) System.out.println("mayis");
        else if (ayNO==6) System.out.println("haziran");
        else if (ayNO==7) System.out.println("temmuz");
        else if (ayNO==8) System.out.println("agustos");
        else if (ayNO==9) System.out.println("eylul");
        else if (ayNO==10) System.out.println("ekim");
        else if (ayNO==11) System.out.println("kasim");
        else if (ayNO==12) System.out.println("aralik");
        else System.out.println("äy numarsi yanlis");

        switch (ayNO){
            case 1 :
                System.out.println("ocak");
                break;
            case 2 :
                System.out.println("subat");
                break;
            case 3 :
                System.out.println("mart");
                break;

            default:
                System.out.println("äy numarsi yanlis");










        }





        }

    }




