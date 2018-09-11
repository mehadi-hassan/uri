import java.io.IOException;
 
import java.util.Scanner;
public class uri_1019{
    public static void main (String[] args){
        Scanner a= new Scanner(System.in);
        int sec = a.nextInt();
        int hrs;
        int HRS;
        int min;
        int MIN;
        hrs=sec/3600;
        HRS=sec%3600;
        min=HRS/60;
        MIN=HRS%60;
        System.out.println(hrs+":"+min+":"+MIN);
    }}
        
       
        