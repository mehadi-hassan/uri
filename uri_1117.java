import java.util.Scanner;
public class uri_1117{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
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
  }
}