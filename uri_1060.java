import java.util.Scanner;
public class uri_1060{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int total=0;
        for (int i=0; i<6; i++)
        {
            double x = a.nextDouble();
            if(x>0){
                 total+=1;}
        }
        System.out.println(total+" "+"valores positivos");
    }
}