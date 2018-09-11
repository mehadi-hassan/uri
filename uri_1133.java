import java.util.Scanner;

public class uri_1133{
  public static void main (String [] args){
    
    Scanner sc  = new Scanner (System.in);
    
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    
    if(num1>num2){
      int temp = num2;
      num2 = num1;
      num1 = temp;
    } 
    
    for(int i = num1+1 ; i<num2 ; i++){
      int temp = i%5;
      if(temp == 2 || temp == 3){
        System.out.println(i);
      }
      
    } 
    
  }
}