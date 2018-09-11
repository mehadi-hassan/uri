import java.util.Scanner;
public class Uri_1099{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int x, y, sum=0, temp = 0;
    for ( int a = 1; a<=num; a++){
      x = sc.nextInt();
      y = sc.nextInt();
      if(x>y){
        temp = y;
        y = x;
        x = temp;
      }
      for (int b = x+1; b<y; b++){
        if(b%2!=0){
          sum+=b;
        }
      }
      System.out.println(sum);
    }
  }
}