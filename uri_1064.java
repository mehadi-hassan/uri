import java.util.Scanner;
public class uri_1064{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int total=0;
        double avrg=0, avrg1=0; 
        for (int i=0; i<6; i++)
        {
            double x = a.nextDouble();
            if(x>0){
                total+=1;
                avrg = (avrg+x);
                avrg1=avrg/total;}
        }
        System.out.println(total+" "+"valores positivos");
        System.out.printf("%.1f\n",avrg1);
    }
}