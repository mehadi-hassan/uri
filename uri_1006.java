import java.util.Scanner;
public class uri_1006{
  public static void main (String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    float a, b, c, avg;
    
    a = sc.nextFloat();
    b = sc.nextFloat();
    c = sc.nextFloat();
    
    avg = (float)(((a*2)+(b*3)+(c*5))/(2+3+5));
    
    System.out.printf("MEDIA = %.1f\n",avg);
  }
}