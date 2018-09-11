import java.util.Scanner;
public class uri_1036{
    public static void main (String[]args){
        double A, B, C, D, R1, R2;
        Scanner a= new Scanner (System.in);
        A = a.nextFloat();
        B = a.nextFloat();
        C = a.nextFloat();
        D =((B*B)-4*A*C);
        R1= (float) ((-B+Math.sqrt(D))/(2*A));
        R2= (float) ((-B-Math.sqrt(D))/(2*A));
        if (D>=0 && A!=0)
        {
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        else
        {
            System.out.println("Impossivel calcular");
        }
    }
}