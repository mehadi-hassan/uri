import java.util.Scanner;
public class uri_1174{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    double N[] = new double [5];
    for (int i = 0; i<N.length; i++){
      N[i] = sc.nextDouble();
    }
    for (int j = 0; j<N.length; j++){
      if (N[j]<=10){
        System.out.println("A["+j+"] = "+N[j]);
      }
    }
  }
}