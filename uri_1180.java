import java.util.Scanner;
public class uri_1180{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int n = sc.nextInt();
    int a[] = new int [n];
    
    for(int i = 0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    
    int min = a[0];
    int pos = 0;
    
    for (int j = 0; j<a.length; j++){
      if (a[j]<min){
        min=a[j];
        pos = j;
      }
    }
    
    System.out.println("Menor valor: "+min);
    System.out.println("Posicao: "+pos);
    
  }
}