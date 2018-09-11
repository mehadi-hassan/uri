import java.util.Scanner;
public class uri_1035{
    public static void main (String[]args){
        int A, B, C, D;
        Scanner a= new Scanner (System.in);
        A = a.nextInt();
        B = a.nextInt();
        C = a.nextInt();
        D = a.nextInt();
        if (B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0)
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
    }
}