import java.util.Scanner;
public class uri_1073{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int X = a.nextInt();
        double ans;
        for (int n=1; n<=X; n++){
            if (n%2==0){
                ans =Math.pow(n,2);
                System.out.println(n+"^2 = "+(int) ans);
            }
        }
    }
}