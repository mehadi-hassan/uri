import java.util.Scanner;
public class uri_1074{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int X = a.nextInt();
        int num;
        for (int n=1; n<=X; n++){
            num = a.nextInt();
            if (num<0){
                if (num%2==0){
                    System.out.println("EVEN NEGATIVE");
                }
                else {System.out.println("ODD NEGATIVE");}
            }
            else if (num==0) {System.out.println("NULL");
            }
            else if (num>0){
                if (num%2==0){
                    System.out.println("EVEN POSITIVE");
                }
                else {System.out.println("ODD POSITIVE");}
            }
            
        }
    }
}