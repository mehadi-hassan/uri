import java.util.Scanner;

public class uri_1080{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num[] = new int [5];
    int max = 0, pos = 0;
    
    for (int i = 0; i<num.length; i++){
      num[i] = sc.nextInt();
    }
    
    for (int j = 0;  j<num.length; j++){
      
      if (num[j]>max){
        max = num[j];
        pos = j;
      }
    }
    
    System.out.println(max+"\n"+(pos+1));
  }
}  