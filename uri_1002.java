import java.util.Scanner;
public class uri_1002 {
  public static void main(String[] args){
    
    double R,A;
    
    Scanner sc = new Scanner(System.in);
    
    R = sc.nextDouble();
    A = 3.14159 * R * R;
    
    System.out.printf("A"+"="+"%.4f",A);
    System.out.print("\n");
  }
}