import java.util.Scanner;
public class uri_1041{
    public static void main (String[]args){
        float x, y;
        Scanner b= new Scanner (System.in);
        x = b.nextFloat();
        y = b.nextFloat();
        if (x>0 && y>0)
        {
            System.out.println("Q1");
        }
        else if (x<0 && y>0)
        {
            System.out.println("Q2");
        }
        else if (x<0 && y<0)
        {
            System.out.println("Q3");
        }
        else if (x>0 && y<0)
        {
            System.out.println("Q4");
        }
        else if (x!=0 && y==0)
        {
            System.out.println("Eixo X");
        }
        else if (x==0 && y!=0)
        {
            System.out.println("Eixo Y");
        }
        else
        {
            System.out.println("Origem");
        }
    }
}    