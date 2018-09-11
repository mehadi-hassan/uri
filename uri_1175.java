import java.util.Scanner;
public class uri_1175{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int[] num = new int [10];
    
    for(int i = 0 ; i<num.length ; i++){
      num[i] = sc.nextInt();
    }
    
    int j = num.length-1;
    for(int i = 0 ; i<(num.length)/2 ; i++){
      int temp = num[i];
      num[i] = num[j];
      num[j] = temp;
      j--;
    }
    
    for(int i = 0 ; i<num.length ; i++){
      System.out.println("N["+i+"] = "+num[i]);
    }
    
    
  }
}