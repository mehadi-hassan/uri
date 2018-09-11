import java.util.Scanner;
public class uri_1009{
  public static void main (String[] args){
    
    double salary, sold, total;
    String name;
    
    Scanner a = new Scanner(System.in);
    
    name = a.next();
    salary = a.nextDouble();
    sold = a.nextDouble();
    
    total = sold*15/100+salary;
    
    System.out.printf("TOTAL = R$ "+"%.2f\n",total);
  }
}