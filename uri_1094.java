import java.util.Scanner;

public class uri_1094{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int n = sc.nextInt();
    int c=0, r=0, s=0, qun;
    String chr;
    
    for (int i = 1; i<=n; i++){
      
      qun = sc.nextInt();
      chr = sc.nextLine();
      
      if (chr.equals(" C")){
        c+=qun;
      }
      else if (chr.equals(" R")){
        r+=qun;
      }
      else if (chr.equals(" S")){
        s+=qun;
      }
    }
    int total = c + r + s;
    double perC = (c*100.00)/total;
    double perR = (r*100.00)/total;
    double perS = (s*100.00)/total;
    
    System.out.println("Total: "+total+" cobaias");
    System.out.println("Total de coelhos: "+c);
    System.out.println("Total de ratos: "+r);
    System.out.println("Total de sapos: "+s);
    System.out.printf("Percentual de coelhos: %.2f %%\n",perC);
    System.out.printf("Percentual de ratos: %.2f %%\n",perR);
    System.out.printf("Percentual de sapos: %.2f %%\n",perS);
  }
}
