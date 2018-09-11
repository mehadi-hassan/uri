import java.util.Scanner;
public class uri_1151{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int n = sc.nextInt();
    int p = 0, q = 1;

    
    for (int i = 1; i<n; i++){
      
      System.out.print(p+" ");
      
      int sum = p+q;
      p = q;
      q = sum;
      
    }
    System.out.println(p);
  }
}
      