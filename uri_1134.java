import java.util.Scanner;
public class uri_1134{
  public static void main (String[]args){
    Scanner in = new Scanner (System.in);
    int x = 0, Alcohol = 0, Gasoline = 0, Diesel =0;
    while (x!=4){
      x = in.nextInt();
      if (x<=1 && x>=4){
        x = in.nextInt();
      }
      else if (x==1){
        Alcohol++;
      }
      else if (x==2){
        Gasoline++;
      }
      else if (x==3){
        Diesel++;
      }
      continue;
      
    }
    System.out.printf("MUITO OBRIGADO\n"+"Alcool: "+Alcohol+
                      "\nGasolina: "+Gasoline+"\nDiesel: "+Diesel+"\n");
  }
}
