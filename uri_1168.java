import java.util.Scanner;
public class uri_1168{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int led;
    for (int i = 1; i<=n; i++){
      led = 0;
      int num = sc.nextInt();
      int num2 = num;
      while (num!=0){
        num%=10;
        if (num==1){
          led+=2;
        }
        if (num==2){
          led+=5;
        }
        if (num==3){
          led+=5;
        }
        if (num==4){
          led+=4;
        }
        if (num==5){
          led+=5;
        }
        if (num==6){
          led+=6;
        }
        if (num==7){
          led+=3;
        }
        if (num==8){
          led+=7;
        }
        if (num==9){
          led+=6;
        }
        if (num==0){
          led+=6;
        }
        num=num2/10;
      }
      System.out.println(led);
    }
  }
}