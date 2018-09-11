import java.util.Scanner;
public class uri_1065{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int total=0;
        
        for (int i=0; i<5; i++)
        {
            int x = a.nextInt();
            if(x%2==0){
                total+=1;}
        }
        System.out.println(total+" "+"valores pares");
        
    }
}