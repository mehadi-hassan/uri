import java.util.Scanner;
public class uri_1067{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int X = a.nextInt();
        if (X>=1 && X<=1000){
            for (int n=1; n<=X; n++){
                if (n%2!=0){
                    System.out.println(n);}
            }
        }
    }
}