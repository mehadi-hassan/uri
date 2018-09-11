import java.util.Scanner;

public class uri_1142{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int k = 1;
    
    for(int i = 0 ; i < num ; i++){
      for (int j = 0 ; j < 4 ; j++){
        if(k%4!=0)
        System.out.print(k+" ");
        k++;
      }
      System.out.println("PUM");
    
    }
        
  }
}