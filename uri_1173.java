import java.util.Scanner;
public class uri_1173{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int N[] = new int [10];
    N[0] = sc.nextInt();
    System.out.println("N[0] = "+N[0]);
    for (int i = 1; i<N.length; i++){
      N[i] = N[i-1]*2;
      System.out.println("N["+i+"] = "+N[i]);
    }
  }
}
    