import java.util.Scanner;
public class uri_1072{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int countIn=0, countOut = 0;
        for(int i  = 1; i<=N; i++){
            int X = sc.nextInt();
            if(X>=10 && X<=20){
                countIn++;
            }
            else{
                countOut++;
            }
        }
        System.out.println(countIn+" in");
        System.out.println(countOut+" out");
    }
}