import java.util.Scanner;
public class uri_1015{
  public static void main (String[]args){
    
    Scanner a= new Scanner(System.in);
    
    double x1, x2, y1, y2, d;
    
    x1 = a.nextDouble();
    y1 = a.nextDouble();
    x2 = a.nextDouble();
    y2 = a.nextDouble();
    
    d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    
    System.out.printf("%.4f\n", d);
  }
}