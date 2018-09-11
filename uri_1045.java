import java.util.Scanner;
public class uri_1045{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double temp;
    if (a < b){
      temp = a;
      a = b;
      b = temp; 
    }
    if (b < c){ 
      temp = b;
      b = c;
      c = temp;
    }
    if (a < b){
      temp = a;
      a = b;
      b = temp;
    }
    if (a >= b + c){
      System.out.println("NAO FORMA TRIANGULO");
    }
    else if (a * a == b * b + c * c){
      System.out.println("TRIANGULO RETANGULO");
    }
    else if (a * a > b * b + c * c){
      System.out.println("TRIANGULO OBTUSANGULO");
    }
    else if (a * a < b * b + c * c){
      System.out.println("TRIANGULO ACUTANGULO");
    }
    if (a == b && b == c){
      System.out.println("TRIANGULO EQUILATERO");
    }
    else if (a == b || b == c){
      System.out.println("TRIANGULO ISOSCELES");
    }
  }
}