import java.util.Scanner;
public class uri_1071{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int X, Y, sum = 0;
        X = sc.nextInt();
        Y = sc.nextInt();
        if (X>Y){
            for (int i = Y+1; i<X; i++){
                if (i%2!=0){
                    sum+=i;
                }
            }
        }
        else if (Y>X){
            for (int j = X+1; j<Y; j++){
                if (j%2!=0){
                    sum+=j;
                }
            }
        }
        System.out.println(sum);
    }
}