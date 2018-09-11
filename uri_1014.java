import java.util.Scanner;
public class uri_1014{
  public static void main (String[]args){
    
    Scanner a= new Scanner(System.in);
    
    int x;
    float y;
    float z;
    
    x = a.nextInt();
    y = a.nextFloat();
    z = x/y;
    
    System.out.printf("%.3f km/l\n", z);
  }
}