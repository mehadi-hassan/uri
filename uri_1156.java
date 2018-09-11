public class uri_1156{
  public static void main (String[]args){
    
    double sum = 0.0, o = 3.0, e = 1.0;
    
    for (double i = 3.0; i<=39.0; i+=2){
      
      double s = o/e;
      sum+=s;
      e*=2;
      
    }
    
    System.out.printf("%.2f\n",sum);
    
  }
}
    