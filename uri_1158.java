import java.util.Scanner;
public class uri_1158{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int n = sc.nextInt();
    
    for (int i = 1; i<=n; i++){
      
      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum = 0;
      
      if (x%2==0){
        x++;
      }

      for (int j = 1; j<=y; j++){
        
        sum+=x;
        x+=2;
      
      }
      
      System.out.println(sum);
    }
    
  }
}