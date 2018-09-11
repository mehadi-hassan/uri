import java.util.Scanner;
public class uri_1154{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int num = 1, sum = 0, pos = 0;
    while (num>0){
      num = sc.nextInt();
      if (num>0){
        sum+=num;
        pos++;
      }
    }
    double avg = (double) sum/pos;
    System.out.printf("%.2f\n",avg);
  }
}
