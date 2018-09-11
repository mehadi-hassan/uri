import java.util.Scanner;
public class uri_1118{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n = 0;
    while (n!=2){
      double n1 = sc.nextDouble();
      while (n1<0 || n1>10){
        System.out.println("nota invalida");
        n1 = sc.nextDouble();
      }
      double n2 = sc.nextDouble();
      while (n2<0 || n2>10){
        System.out.println("nota invalida");
        n2 = sc.nextDouble();
      }
      double avg = (n1+n2)/2;
      System.out.printf("media = %.2f\n",avg);
      System.out.println("novo calculo (1-sim 2-nao)");
      n = sc.nextInt();
      if (n==1 ||n==2){
        System.out.println("novo calculo (1-sim 2-nao)");
      }
    }
  }
}