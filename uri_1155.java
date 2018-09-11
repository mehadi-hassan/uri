public class uri_1155{
  public static void main (String[]args){
    
    double s = 0.0, sum = 0.0;
    
    for (double i=1.0; i<=100.0; i++){
      
      s = 1.0/i;
      sum+=s;
    }
    
    System.out.printf("%.2f\n",sum);
    
  }
}