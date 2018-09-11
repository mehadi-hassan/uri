import java.util.Scanner;
public class uri_1013{
  public static void main (String[]args){
    
    Scanner a= new Scanner(System.in);
    
    int x, y, z, m, n;
    
    x = a.nextInt();
    y = a.nextInt();
    z = a.nextInt();
    
    m=(x+y+Math.abs(x-y))/2;
    n=(m+z+Math.abs(m-z))/2;
    
    System.out.println(n+" "+"eh o maior");
  }
}