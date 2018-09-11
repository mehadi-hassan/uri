import java.util.Scanner;
public class uri_1011{
  public static void main (String[]args){
    
    Scanner a= new Scanner(System.in);
    
    double pi, R, vol;
    
    pi = 3.14159;
    R = a.nextDouble();
    
    vol = (4.0/3.0)*pi*R*R*R;
    
    System.out.printf("VOLUME = "+"%.3f\n",vol);
  }
}