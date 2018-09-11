import java.util.Scanner;
public class uri_1046{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int A, B, C, temp;
        A = a.nextInt();
        B = a.nextInt();
        if (A<=B)
        {
            C = B-A;
            if (C==0)
            {
                System.out.println("O JOGO DUROU 24 HORA(S)");}
            else {System.out.println("O JOGO DUROU"+" "+C+" "+"HORA(S)");}
        }
        else {
            C = 24- A +B;
            if (C==0)
            {
                System.out.println("O JOGO DUROU 24 HORA(S)");}
            else {System.out.println("O JOGO DUROU"+" "+C+" "+"HORA(S)");}
        }
    }
}