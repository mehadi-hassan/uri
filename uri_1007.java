import java.util.Scanner;
public class uri_1007{
  public static void main(String[] args){
    
    Scanner a = new Scanner(System.in);
    
    int A, B, C, D, DIFERENCA;
    
    A = a.nextInt();
    B = a.nextInt();
    C = a.nextInt();
    D = a.nextInt();
    
    DIFERENCA = (A * B - C * D);
    
    System.out.println("DIFERENCA ="+" "+DIFERENCA);
  }
}