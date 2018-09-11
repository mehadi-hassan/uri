import java.util.Scanner;
public class uri_1012{
  public static void main (String[]args){
    
    Scanner a = new Scanner (System.in);
    
    double A, B, C, tri, cir, tra, qua, ret;
    
    A = a.nextDouble();
    B = a.nextDouble();
    C = a.nextDouble();
    
    tri = 0.5*A*C;
    cir = 3.14159*C*C;
    tra = ((A+B)/2)*C;
    qua = B*B;
    ret = A*B;
    
    System.out.printf("TRIANGULO:"+" "+"%.3f\n", tri);
    System.out.printf("CIRCULO:"+" "+"%.3f\n", cir);
    System.out.printf("TRAPEZIO:"+" "+"%.3f\n", tra);
    System.out.printf("QUADRADO:"+" "+"%.3f\n", qua);
    System.out.printf("RETANGULO:"+" "+"%.3f\n", ret);
  }
}