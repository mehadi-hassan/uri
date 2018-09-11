import java.util.Scanner;
public class uri_1142{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int x = sc.nextInt();
    int n = 1;
    
    for (int i=1; i<=x; i++){

        while(n%4!=0){
          System.out.print(n+" ");
          n++;

        }

      
        System.out.println("PUM");
       
      }
    }
  }
