import java.util.Scanner;
public class uri_1146{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int num = 1;
    while (num!=0){
      num = sc.nextInt();
      for (int i = 1; i<num; i++){
        System.out.print(i+" ");
      }
      if (num!=0)
        System.out.println(num);
    }
  }
}