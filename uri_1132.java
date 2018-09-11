import java.util.Scanner;
public class uri_1132{
  public static void main (String[]args){
    Scanner in = new Scanner (System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    int sum = 0;
    if (y<x){
      int temp = y;
      y = x;
      x = temp;
    }
    for (int i = x; i<=y; i++){
      if (i%13!=0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
}