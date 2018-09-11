import java.util.Scanner;
public class uri_1043{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        double A, B, C, area, pre;
        A = a.nextDouble();
        B = a.nextDouble();
        C = a.nextDouble();
        if (A+B>C && A+C>B && B+C>A){
            pre = A+B+C;
            System.out.printf("Perimetro ="+" "+"%.1f\n", pre);
        }
        else
        {
            area = ((A+B)/2)*C;
            System.out.printf("Area ="+" "+"%.1f\n", area);
        }
    }
}