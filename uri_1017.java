import java.util.Scanner;
public class uri_1017{
    public static void main (String[]args){
        Scanner a= new Scanner(System.in);
        int t, d;
        double l, t1, d1;
        t = a.nextInt();
        d = a.nextInt();
        t1 = (double) t;
        d1 = (double) d;
        l = (d1/12)*t1;
        System.out.printf("%.3f", l);
        System.out.print("\n");
    }
}