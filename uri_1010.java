import java.util.Scanner;
public class uri_1010{
  public static void main (String[] args){
    
    Scanner a = new Scanner(System.in);
    
    int s1, q1, s2, q2;
    double r1, r2, total;
    
    s1= a.nextInt();
    q1= a.nextInt();
    r1= a.nextDouble();
    s2= a.nextInt();
    q2= a.nextInt();
    r2= a.nextDouble();
    
    total = (q1*r1)+(q2*r2);
    
    System.out.printf("VALOR A PAGAR: R$ "+"%.2f\n",total);
  }
}