import java.util.Scanner;
public class uri_1020{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int day = sc.nextInt();
        int yr  = day/365;
        int mon = (day%365)/30;
        int dy = (day%365)%30;
        System.out.printf(yr+" ano(s)\n"+mon+" mes(es)\n"+dy+" dia(s)\n");
    }
}