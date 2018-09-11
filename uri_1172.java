import java.util.Scanner;
public class uri_1172{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int a[] = new int [10];
    for (int i = 0; i<a.length; i++){
      a[i] = sc.nextInt();
      if (a[i]==0 || a[i]<0){
        a[i] = 1;
      }
    }
    for (int j = 0; j<a.length; j++){
      System.out.println("X["+j+"] = "+a[j]);
    }
  }
}