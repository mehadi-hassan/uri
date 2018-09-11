import java.util.Scanner;
public class uri_1038{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int X, Y; 
        double total;
        X = a.nextInt();
        Y = a.nextInt();
        if(X==1)
        {
            total = 4.00*Y;
            System.out.printf("Total: R$ "+"%.2f",total);
        }
        if(X==2)
        {
            total = 4.50*Y;
            System.out.printf("Total: R$ "+"%.2f",total);
        }
        if(X==3)
        {
            total = 5.00*Y;
            System.out.printf("Total: R$ "+"%.2f",total);
        }
        if(X==4)
        {
            total = 2.00*Y;
            System.out.printf("Total: R$ "+"%.2f",total);
        }
        if(X==5)
        {
            total = 1.50*Y;
            System.out.printf("Total: R$ "+"%.2f",total);
        }
        System.out.print("\n");
    }
}