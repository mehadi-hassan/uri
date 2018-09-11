import java.util.Scanner;
public class uri_1150{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int x = sc.nextInt();
    int z = sc.nextInt();
    int sum=0, pos =0;
    
    while (z<=x){
      z = sc.nextInt();
    }
    
    for (int i = x; i<z; i++){
      sum+=i;
      pos++;
      if (sum>z)
        break;
    }
    
    System.out.println(pos);
    
  }
}