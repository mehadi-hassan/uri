import java.util.Scanner;
public class uri_1005{
  public static void main (String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    float a, b, avg;
    
    a = sc.nextFloat();
    b = sc.nextFloat();
    
    avg = (float)(((a*3.5)+(b*7.5))/(3.5+7.5));
    
    System.out.printf("MEDIA = %.5f\n",avg);
  }
}