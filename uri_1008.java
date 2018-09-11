import java.util.Scanner;
public class uri_1008{
  public static void main (String[] args){
    
    int num, hrs;
    float amount, salary;
    
    Scanner money = new Scanner(System.in);
    
    num = money.nextInt();
    hrs = money.nextInt();
    amount = money.nextFloat();
    salary = hrs*amount;
    
    System.out.println("NUMBER ="+" "+num);
    System.out.printf("SALARY ="+" "+"U$"+" "+"%.2f",salary);
    System.out.print("\n");
  }
}