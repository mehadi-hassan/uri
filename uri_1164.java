import java.util.Scanner;
public class uri_1164{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    for (int i = 1; i<=n; i++){
      int num = sc.nextInt();
      int sum = 0;
      for (int j = 1; j<num; j++){
        if (num%j==0){
          sum+=j;
        }
      }
      if (sum==num){
        System.out.println(num+" eh perfeito");
      }
      else {
        System.out.println(num+" nao eh perfeito");
      }
    }
  }
}