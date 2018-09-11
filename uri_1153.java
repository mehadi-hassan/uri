import java.util.Scanner;
public class uri_1153{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int fib = 1;
    for (int i = num; i>=1; i--){
      fib*=i;
    }
    System.out.println(fib);
  }
}