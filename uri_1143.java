import java.util.Scanner;
public class uri_1143{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int j = 1;
    for (int i = 1; i<=n; i++){
      //j = i;
      System.out.print(j+" ");
      j=j*j;
    }
  }
}
      