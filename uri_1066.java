import java.util.Scanner;
public class uri_1066{
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        int even=0,odd=0, neg=0, pos=0;
        
        for (int i=0; i<5; i++)
        {
            int x = a.nextInt();
            if(x%2==0){
                even+=1;}
            if(x%2!=0){
                odd+=1;}
            if(x<0){
                neg+=1;}
            if(x>0){
                pos+=1;}
        }
        System.out.println(even+" "+"valor(es) par(es)");
        System.out.println(odd+" "+"valor(es) impar(es)");
        System.out.println(pos+" "+"valor(es) positivo(s)");
        System.out.println(neg+" "+"valor(es) negativo(s)");
        
    }
}