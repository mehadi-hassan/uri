import java.util.Scanner;
public class uri_1070{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int X = a.nextInt();
        int count =1;
            while (count<=6) {
                if (X%2!=0){
                    System.out.println(X);
                    count++;}
                X++;}
    }
}